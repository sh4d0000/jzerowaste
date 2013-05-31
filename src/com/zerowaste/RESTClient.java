package com.zerowaste;

import java.io.IOException;


public interface RESTClient {
	
	public <T> T get(String url, Class<T> type) throws IOException ;
	public <T> T post(String url, Class<T> type, Object data) throws IOException;
	public <T> T put(String url, Class<T> type, Object data) throws IOException;	
	public <T> T delete(String url, Class<T> type) throws IOException;	
	
}
