package com.kornog.vcm.gui.client.events;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsonUtils;
import com.google.gwt.dom.client.TableCellElement;
import com.google.gwt.dom.client.TableRowElement;
import com.google.gwt.dom.client.TableSectionElement;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;
import com.kornog.vcm.gui.shared.AjaxConnect;
import com.kornog.vcm.gui.shared.VehiculeDTO;

public class RefreshEvent implements EventListener, AttachEvent.Handler, AjaxConnect.Callback {

	final String API_VEHICULES = "http://127.0.0.1:8080/api/vehicules";

	final AjaxConnect getVehicules;	
	final TableSectionElement vehiculesField;
	
	public RefreshEvent(TableSectionElement vehiculesField) {
		super();
		this.vehiculesField = vehiculesField;
		getVehicules = new AjaxConnect(API_VEHICULES, this);
	}

	@Override
	public void onBrowserEvent(Event event) {
		getVehicules.now();
	}

	@Override
	public void onAttachOrDetach(AttachEvent event) {
		getVehicules.now();			
	}

	@Override
	public void onResponseReceived(Request request, Response response) {
		vehiculesField.setInnerHTML("");
		JsArray<VehiculeDTO> vehicules = JsonUtils.safeEval(response.getText());

		for (int i = 0, count = vehicules.length(); i < count; i++) {
			VehiculeDTO v = vehicules.get(i);
			TableRowElement row = vehiculesField.insertRow(-1);
			TableCellElement cell = row.insertCell(-1);
			if (v.getImmat() != null) {
				cell.setInnerHTML(v.getImmat());
			}
		}
	}

	@Override
	public void onError(Request request, Throwable exception, Response response) {
		// TODO Auto-generated method stub
		
	}
}
