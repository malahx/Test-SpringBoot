package com.kornog.vcm.gui.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.ButtonElement;
import com.google.gwt.dom.client.TableSectionElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.kornog.vcm.gui.client.events.RefreshEvent;

public class VehiculeAdd extends Composite {

	private static VehiculeAddUiBinder uiBinder = GWT.create(VehiculeAddUiBinder.class);

	@UiField
	TableSectionElement vehiculesField;

	@UiField
	HTMLPanel panel;

	@UiField
	ButtonElement refresh;

	@UiTemplate("VehiculeAdd.ui.xml")
	interface VehiculeAddUiBinder extends UiBinder<Widget, VehiculeAdd> {
	}

	public VehiculeAdd() {
		initWidget(uiBinder.createAndBindUi(this));
		
		Event.sinkEvents(refresh, Event.ONCLICK);
		Event.setEventListener(refresh, new RefreshEvent(vehiculesField));
		
		panel.addAttachHandler(new RefreshEvent(vehiculesField));
	}

}
