package com.zerowaste;

import static com.zerowaste.EndpointManager.getDeleteEndpoint;
import static com.zerowaste.EndpointManager.getAllEndpointBy;
import static com.zerowaste.EndpointManager.getPostEndpoint;
import static com.zerowaste.EndpointManager.getPutEndpoint;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import com.zerowaste.model.Model;

public class ModelManager<T extends Model > {

	private final RESTClient restClient;
	private final Class<T> type;

	public ModelManager(Class<T> type) {
		super();

		restClient = new JZeroWasteRESTClient();
		this.type = type;
	}

	public T getRole(Long id) throws IOException {
		return restClient.get(getPostEndpoint(type), type);
	}

	@SuppressWarnings("unchecked")
	public Collection<T> getAll() throws IOException {
		T[] a = (T[]) Array.newInstance(type, 0);
		Class<T[]> t = (Class<T[]>) a.getClass();
		return Arrays.asList(restClient.get( getAllEndpointBy(t), t ));
	}

	public T save(T model) throws IOException {
		return restClient.post(getAllEndpointBy(type), type, model);
	}

	public T update(T model) throws IOException {
		return restClient.put(getPutEndpoint(type, model.getId()), type, model);
	}

	public T delete(T model) throws IOException {
		return restClient.delete(getDeleteEndpoint(type, model.getId()), type);
	}

	public Class<T> getActualParameterizedType() {
		return type;
	}

}
