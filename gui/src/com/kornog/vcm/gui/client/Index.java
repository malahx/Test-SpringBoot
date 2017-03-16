package com.kornog.vcm.gui.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Index implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
		// Loading of the VehiculeAdd ui
		RootPanel.get("appContainer").add(new VehiculeAdd());
	}
}
