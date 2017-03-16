package com.kornog.vcm.gui.shared;

import com.google.gwt.core.client.JavaScriptObject;

/***
 * 
 * @author gwenole
 *
 */
public class VehiculeDTO extends JavaScriptObject {
	
	/**
	 * 
	 */
	protected VehiculeDTO() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @return l'immatriculation du véhicule
	 */
	public final native String getImmat() /*-{ return this.immat; }-*/;
}

