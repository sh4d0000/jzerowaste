package com.zerowaste.manager;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import com.zerowaste.model.OwnedModel;
import com.zerowaste.rest.JZWRESTClient;
import com.zerowaste.rest.OwnedResourceIdentifiable;
import com.zerowaste.rest.RESTClient;

public class OwnedModelManager<T extends OwnedModel & OwnedResourceIdentifiable > {

	private final RESTClient restClient;
	private final Class<T> type;

	public OwnedModelManager(Class<T> type) {
		super();

		restClient = new JZWRESTClient();
		this.type = type;
	}

	public T get(Long id, Long ownerId) throws IOException, InstantiationException, IllegalAccessException {
		return restClient.get( type.newInstance().getGetURI(ownerId, id), type);
	}

	@SuppressWarnings("unchecked")
	public Collection<T> getAll(Long ownerId) throws IOException, InstantiationException, IllegalAccessException {
		T[] a = (T[]) Array.newInstance(type, 0);
		Class<T[]> t = (Class<T[]>) a.getClass();
		T[] ts = restClient.get( type.newInstance().getAllURI(ownerId), t );
		
		return Arrays.asList(ts);
	}

	public T save(T model) throws IOException {
		return restClient.post(model.getPostURI(model.getOwnerId()), type, model);
	}

	public T update(T model) throws IOException {
		return restClient.put(model.getPutURI(model.getOwnerId()), type, model);
	}

	public T delete(T model) throws IOException {
		return restClient.delete(model.getDeleteURI(model.getOwnerId()), type);
	}

	public RESTClient getRestClient() {
		return restClient;
	}

	public Class<T> getType() {
		return type;
	}
	
	

}
