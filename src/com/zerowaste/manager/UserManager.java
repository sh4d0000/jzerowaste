package com.zerowaste.manager;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.HttpStatus;

import com.google.api.client.http.HttpResponseException;
import com.zerowaste.model.User;

public class UserManager extends ModelManager<User> {

	public UserManager() {
		super(User.class);
	}
	
	public boolean existsUserWithEmail(String email) throws IOException {
		return exists("email", email);
	}
	
	public boolean existsUserWithNickname(String nickname) throws IOException {
		return exists("nickname", nickname);
	}
	
	public User findByNickname(String nickname) throws IOException {
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("nickname", nickname);

		try {
			
			User user = restClient.get(User.BASE_URI + User.USERS_SUB_URI, type, params);
			return user;
			
		} catch (HttpResponseException e) {
			if (e.getStatusCode() == HttpStatus.SC_NOT_FOUND)
				return null;
			else throw e;
		} 
		
	}

	public boolean exists(String key, String value) throws IOException {

		HashMap<String, String> params = new HashMap<String, String>();
		params.put(key, value);

		try {
			restClient.get(User.BASE_URI + User.USERS_SUB_URI, type, params);
		} catch (HttpResponseException e) {
			if (e.getStatusCode() == HttpStatus.SC_NOT_FOUND)
				return false;
			else
				throw e;
		}

		return true;
	}

}
