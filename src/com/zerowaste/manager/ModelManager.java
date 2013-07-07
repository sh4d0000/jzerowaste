package com.zerowaste.manager;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import com.zerowaste.model.Model;
import com.zerowaste.rest.JZWRESTClient;
import com.zerowaste.rest.RESTClient;
import com.zerowaste.rest.ResourceIdentifiable;

public class ModelManager<T extends Model & ResourceIdentifiable> {

	protected final RESTClient restClient;
	protected Class<T> type;
	
	

	public ModelManager() {
		super();
		
		restClient = new JZWRESTClient();
	}

	public ModelManager(Class<T> type) {
		super();

		restClient = new JZWRESTClient();
		this.type = type;
	}

	public T get(Long id) throws IOException, InstantiationException, IllegalAccessException {
		return restClient.get( type.newInstance().getGetURI(id), type);
	}

	@SuppressWarnings("unchecked")
	public Collection<T> getAll() throws IOException, InstantiationException, IllegalAccessException {
		T[] a = (T[]) Array.newInstance(type, 0);
		Class<T[]> t = (Class<T[]>) a.getClass();
		return Arrays.asList(restClient.get( type.newInstance().getAllURI(), t ));
	}

	public T save(T model) throws IOException {
		return restClient.post(model.getPostURI(), type, model);
	}

	public T update(T model) throws IOException {
		return restClient.put(model.getPutURI(), type, model);
	}

	public T delete(T model) throws IOException {
		return restClient.delete(model.getDeleteURI(), type);
	}

	public RESTClient getRestClient() {
		return restClient;
	}

	public Class<T> getType() {
		return type;
	}
	
	public Class<T> setType(Class<T> type) {
		return this.type = type;
	}
	
	

}
