package org.eclipse.jetty.client;


import org.eclipse.jetty.http.HttpField;
import org.eclipse.jetty.http.HttpHeader;
import org.eclipse.jetty.util.Jetty;

public class HttpClientProduct {
	private volatile HttpField agentField = new HttpField(HttpHeader.USER_AGENT, "Jetty/" + Jetty.VERSION);

	public HttpField getAgentField() {
		return agentField;
	}

	/**
	* @param agent  the "User-Agent" HTTP header string of this  {@link HttpClient}
	*/
	public void setUserAgentField(HttpField agent) {
		if (agent.getHeader() != HttpHeader.USER_AGENT) {
			throw new IllegalArgumentException();
		}
		this.agentField = agent;
	}
}