package com.zerowaste;

import com.zerowaste.model.Model;
import com.zerowaste.model.Role;
import com.zerowaste.model.User;

public class EndpointManager {

	public static final String BASE_ENDPOINT = "http://api.frapi/zerowaste/";
	public static final String ROLES_PATH = "roles/";
	public static final String USERS_PATH = "users/";

	public static <T extends Model> String getAllEndpointBy(Class<T> type) {

		if (type.equals(Role.class) || type.equals(Role[].class)) {
			return BASE_ENDPOINT + ROLES_PATH;
		} else if (type.equals(User.class) || type.equals(User[].class)) {
			return BASE_ENDPOINT + USERS_PATH;
		}

		return BASE_ENDPOINT + type;

	}

	public static <T extends Model> String getPostEndpoint(Class<T> type) {
		return getAllEndpointBy(type);
	}

	public static <T extends Model> String getPutEndpoint(Class<T> type, Long id) {
		return getAllEndpointBy(type) + id;
	}

	public static <T extends Model> String getDeleteEndpoint(Class<T> type, Long id) {
		return getAllEndpointBy(type) + id;
	}

}
