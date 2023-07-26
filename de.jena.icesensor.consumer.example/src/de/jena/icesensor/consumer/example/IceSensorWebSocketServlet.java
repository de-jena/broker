package de.jena.icesensor.consumer.example;

import java.util.Hashtable;

import org.eclipse.jetty.websocket.server.JettyWebSocketServlet;
import org.eclipse.jetty.websocket.server.JettyWebSocketServletFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.framework.wiring.BundleWiring;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.http.whiteboard.HttpWhiteboardConstants;
import org.osgi.service.http.whiteboard.annotations.RequireHttpWhiteboard;

import jakarta.servlet.Servlet;

@Component
@RequireHttpWhiteboard
public class IceSensorWebSocketServlet extends JettyWebSocketServlet {

	private static final long serialVersionUID = 1L;
	
	private ServiceRegistration<Servlet> service;

	@Activate
	public void start(BundleContext context) {
		ClassLoader original = Thread.currentThread().getContextClassLoader();
		ClassLoader jettyClassLoader = getJettyBundle(context).adapt(BundleWiring.class).getClassLoader();
		Thread.currentThread().setContextClassLoader(jettyClassLoader);
		try {
			Hashtable<String, String> properties = new Hashtable<>();
			properties.put(HttpWhiteboardConstants.HTTP_WHITEBOARD_SERVLET_PATTERN, "/socket");
			service = context.registerService(Servlet.class, this, properties);
		} finally {
			Thread.currentThread().setContextClassLoader(original);
		}
	}

	@Deactivate
	public void stop(BundleContext context) {
		service.unregister();
	}

	@Override
	public void configure(JettyWebSocketServletFactory factory) {
		factory.register(IceWebSocket.class);
	}
	
	private Bundle getJettyBundle(BundleContext context) {
		for (Bundle bundle : context.getBundles()) {
			if (bundle.getSymbolicName().equals("org.apache.felix.http.jetty")) {
				return bundle;
			}
		}
		throw new RuntimeException("Jetty not found");
	}
}