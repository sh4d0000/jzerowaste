package com.zerowaste.rest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.http.json.JsonHttpContent;
import com.google.api.client.json.Json;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson2.JacksonFactory;

public class JZWRESTClient implements RESTClient {

	private final HttpTransport HTTP_TRANSPORT;
	private final JsonFactory JSON_FACTORY;
	private String contentType;
	private String acceptType;
	private HttpRequestFactory requestFactory;

	public JZWRESTClient() {
		super();

		HTTP_TRANSPORT = new NetHttpTransport();
		JSON_FACTORY = new JacksonFactory();

		this.contentType = Json.MEDIA_TYPE;
		this.acceptType  = Json.MEDIA_TYPE;

		requestFactory = HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {
			@Override
			public void initialize(HttpRequest request) {
				request.setParser(new JsonObjectParser(JSON_FACTORY));
			}
		});

	}
	
	public <T> T get(String url, Class<T> type) throws IOException {
		HttpRequest request = requestFactory.buildGetRequest(new GenericUrl(url));
		
		setUpCommonHeaders(request);
		
		return request.execute().parseAs(type);
	}


	public <T> T get(String url, Class<T> type, Map<String, String> params) throws IOException {
		
		String urlEnconded = null;
		
		if( params != null && !params.isEmpty()) {
		    urlEnconded = encode(url, params);
		} else {
			urlEnconded = url;
		}
		
		HttpRequest request = requestFactory.buildGetRequest( new GenericUrl(urlEnconded) );
		setUpCommonHeaders(request);
		
		return request.execute().parseAs(type);
	}

	private String encode(String url, Map<String, String> params) throws UnsupportedEncodingException {
		StringBuffer urlBuffer = new StringBuffer(url);
		urlBuffer.append("?");

		for (Map.Entry<String, String> entry : params.entrySet()) {
			urlBuffer.append( entry.getKey() );
			urlBuffer.append( "=" );
			urlBuffer.append( URLEncoder.encode(entry.getValue() , "UTF-8") );
			urlBuffer.append( "&" );
		}
		
		String urlEnconded = urlBuffer.substring(0, urlBuffer.length()-1);
		return urlEnconded;
	}

	public <T> T post(String url, Class<T> type, Object data) throws IOException {
		JsonHttpContent content = new JsonHttpContent(JSON_FACTORY, data);
		HttpRequest request = requestFactory.buildPostRequest(new GenericUrl(url), content);

		setUpCommonHeaders(request);
		
		return request.execute().parseAs(type);
	}

	public <T> T put(String url, Class<T> type, Object data) throws IOException {
		JsonHttpContent content = new JsonHttpContent(JSON_FACTORY, data);
		HttpRequest request = requestFactory.buildPutRequest(new GenericUrl(url), content);

		setUpCommonHeaders(request);

		return request.execute().parseAs(type);
	}

	public <T> T delete(String url, Class<T> type) throws IOException {
		HttpRequest request = requestFactory.buildDeleteRequest(new GenericUrl(url));

		setUpCommonHeaders(request);

		return request.execute().parseAs(type);
	}

	private void setUpCommonHeaders(HttpRequest request) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setAccept(acceptType);
		httpHeaders.setContentType(contentType);

		request.setHeaders(httpHeaders);
	}
	
}
