package com.kornog.vcm.gui.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.dom.client.TableCellElement;
import com.google.gwt.dom.client.TableRowElement;
import com.google.gwt.dom.client.TableSectionElement;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.kornog.vcm.gui.shared.VehiculeDTO;

public class VehiculeAdd extends Composite {

	final String API_VEHICULES = "http://127.0.0.1:8080/api/vehicules";

	private static VehiculeAddUiBinder uiBinder = GWT.create(VehiculeAddUiBinder.class);

	@UiField
	TableSectionElement vehiculesField;

	@UiField
	HTMLPanel panel;

	@UiTemplate("VehiculeAdd.ui.xml")
	interface VehiculeAddUiBinder extends UiBinder<Widget, VehiculeAdd> {
	}

	public VehiculeAdd() {
		initWidget(uiBinder.createAndBindUi(this));
		panel.addAttachHandler(new AttachEvent.Handler() {

			@Override
			public void onAttachOrDetach(AttachEvent event) {

				RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, URL.encode(API_VEHICULES));

				try {
					Request request = builder.sendRequest(null, new RequestCallback() {
						public void onError(Request request, Throwable exception) {

						}

						public void onResponseReceived(Request request, Response response) {
							if (200 == response.getStatusCode()) {
								
								JsArray<VehiculeDTO> vehicules = JsonUtils.safeEval(response.getText());

								for (int i = 0, count = vehicules.length(); i < count; i++) {
									VehiculeDTO v = vehicules.get(i);
									TableRowElement row = vehiculesField.insertRow(-1);
									TableCellElement cell = row.insertCell(-1);
									if (v.getImmat() != null) {
										cell.setInnerText(v.getImmat());
									}
								}
							} else {

							}
						}
					});
				} catch (RequestException e) {
					// Couldn't connect to server
				}
			}

		});

	}

}
