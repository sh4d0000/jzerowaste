package com.zerowaste.rest;

import java.io.IOException;
import java.util.Map;


public interface RESTClient {
	
	public <T> T get(String url, Class<T> type) throws IOException;
	public <T> T get(String url, Class<T> type, Map<String, String> params) throws IOException;
	public <T> T post(String url, Class<T> type, Object data) throws IOException;
	public <T> T put(String url, Class<T> type, Object data) throws IOException;	
	public <T> T delete(String url, Class<T> type) throws IOException;	
	
}
