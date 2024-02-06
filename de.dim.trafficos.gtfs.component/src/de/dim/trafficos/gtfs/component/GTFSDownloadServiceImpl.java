/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package de.dim.trafficos.gtfs.component;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.protocol.HttpContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;

import de.dim.trafficos.gtfs.component.helper.GTFSHelper;
import de.dim.trafficos.gtfs.component.helper.UnzipHelper;
import de.dim.trafficos.publictransport.apis.gtfs.GTFSDownloadService;

/**
 * 
 * @author ilenia
 * @since Jul 17, 2023
 */
@Component(name = "GTFSDownloadService", service = GTFSDownloadService.class, configurationPid = "GTFSDownloadService", configurationPolicy = ConfigurationPolicy.REQUIRE)
public class GTFSDownloadServiceImpl implements GTFSDownloadService {

	public @interface GTFSDownloadServiceConfig {
		String germanStopsDownloadLink() default "";
		String germanStopsFolder() default "deutschlandweite-haltestellendaten-xml";
		String germanScheduleDownloadLink() default "";
		String germanScheduleFolder() default "deutschlandweite-sollfahrplandaten-gtfs";
	}

	private static final Logger LOGGER = Logger.getLogger(GTFSDownloadServiceImpl.class.getName());
	private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss_SSS");
	private GTFSDownloadServiceConfig config;
	RedirectStrategy redirectStrategy = new DefaultRedirectStrategy() {
		Map<String, Header> cookies = new HashMap<>();

		@Override 
		public HttpUriRequest getRedirect(HttpRequest request, HttpResponse response, HttpContext context) throws ProtocolException {
			//
			// Get the cookies out of the response so we can inject them into the redirect.
			//
			for (Header header : response.getHeaders("Set-Cookie")) {
				this.cookies.put(header.getName(), header);
			}

			HttpUriRequest redirect = super.getRedirect(request, response, context);

			for (Header cookie : this.cookies.values()) {
				redirect.addHeader("Cookie", cookie.getValue());
			}
			return redirect;
		};
	};


	@Activate
	public void activate(GTFSDownloadServiceConfig config) {
		this.config = config;
	}

	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.gtfs.GTFSDownloadService#downloadGermanStopsData()
	 */
	@Override
	public void downloadGermanStopsData() {
		Timestamp timestamp = Timestamp.from(Instant.now());		
		String fileName = config.germanStopsFolder() + "_" + SIMPLE_DATE_FORMAT.format(timestamp);
		sendGetRequest(config.germanStopsDownloadLink(), fileName);
		UnzipHelper.unzipFile(GTFSHelper.getDataFolder()+fileName+".zip", GTFSHelper.getDataFolder()+config.germanStopsFolder());
	}

	
	/* 
	 * (non-Javadoc)
	 * @see de.dim.trafficos.publictransport.apis.gtfs.GTFSDownloadService#downloadGermanScheduleData()
	 */
	@Override
	public void downloadGermanScheduleData() {		 
		Timestamp timestamp = Timestamp.from(Instant.now());
		String fileName = config.germanScheduleFolder() + "_" + SIMPLE_DATE_FORMAT.format(timestamp);
		sendGetRequest(config.germanScheduleDownloadLink(), fileName);
		UnzipHelper.unzipFile(GTFSHelper.getDataFolder()+fileName+".zip", GTFSHelper.getDataFolder()+config.germanScheduleFolder());
	}

	
	private void sendGetRequest(String uri, String outFileName) {
		final HttpGet request = new HttpGet(uri);
		LOGGER.info("downloading " + uri + " to file: " + outFileName);
		try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
			httpClient.execute(request, response -> {
				try(InputStream is = response.getEntity().getContent();
						FileOutputStream output = new FileOutputStream(new File(GTFSHelper.getDataFolder()+outFileName+".zip"))) {
					output.write(is.readAllBytes());
				}
				return response;
			});
		} catch (IOException e) {
			LOGGER.severe(String.format("Error when sending download request %s", uri));
			e.printStackTrace();
		}
	}
}
