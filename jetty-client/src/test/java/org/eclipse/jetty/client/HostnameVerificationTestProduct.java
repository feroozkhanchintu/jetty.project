package org.eclipse.jetty.client;


import org.eclipse.jetty.server.Server;
import org.junit.After;

public class HostnameVerificationTestProduct {
	private Server server = new Server();

	public Server getServer() {
		return server;
	}

	@After
	public void tearDown(HttpClient client) throws Exception {
		client.stop();
		server.stop();
		server.join();
	}
}