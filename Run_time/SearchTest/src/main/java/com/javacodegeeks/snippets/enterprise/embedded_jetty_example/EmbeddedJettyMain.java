package com.javacodegeeks.snippets.enterprise.embedded_jetty_example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import com.javacodegeeks.snippets.enterprise.embeddedjetty.servlet.ExampleServlet;

public class EmbeddedJettyMain {
	public static void main(String[] args) throws Exception {
		Server server = new Server(7071);
		ServletContextHandler handler = new ServletContextHandler(server, "/example");
		handler.addServlet(ExampleServlet.class, "/");
		server.start();
	}
}
