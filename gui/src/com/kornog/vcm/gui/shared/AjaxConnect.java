package com.kornog.vcm.gui.shared;

import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.http.client.URL;

public class AjaxConnect {

	final String link;
	final Callback callback;

	
	public AjaxConnect(String link, Callback callback) {
		super();
		this.link = link;
		this.callback = callback;
	}
	
	public void now() {
		RequestBuilder builder = new RequestBuilder(RequestBuilder.GET, URL.encode(link));

		try {
			Request request = builder.sendRequest(null, new AjaxRequest());
		} catch (RequestException e) {
			callback.onError(null, null, null);
		}
	}

	class AjaxRequest implements RequestCallback {

		@Override
		public void onResponseReceived(Request request, Response response) {
			if (200 == response.getStatusCode()) {
				callback.onResponseReceived(request, response);
			} else {
				callback.onError(request, null, response);
			}
		}

		@Override
		public void onError(Request request, Throwable exception) {
			callback.onError(request, exception, null);
		}

	}

	public interface Callback {
		public void onResponseReceived(Request request, Response response);

		public void onError(Request request, Throwable exception, Response response);
	}
}
