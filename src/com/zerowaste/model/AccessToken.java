package com.zerowaste.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.google.api.client.util.Key;
import com.zerowaste.rest.OwnedResourceIdentifiable;

public class AccessToken implements OwnedModel, OwnedResourceIdentifiable {

	@Key
	private long id;
	@Key
	private String token;
	@Key("user_id")
	private long userId;

	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String getGetURI(Long id, Long accessToken) {
		throw new NotImplementedException();
	}

	@Override
	public String getAllURI(Long userId) {
		return BASE_URI + USER_HAS_ACCESS_TOKEN_SUB_URI.replace(":user_id", userId.toString());
	}

	@Override
	public String getPostURI(Long roleId) {
		throw new NotImplementedException();		
	}

	@Override
	public String getPutURI(Long roleId) {
		throw new NotImplementedException();
	}

	@Override
	public String getDeleteURI(Long roleId) {
		throw new NotImplementedException();
	}
	
	@Override
	public Long getOwnerId() {
		return userId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + (int) (userId ^ (userId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccessToken other = (AccessToken) obj;
		if (id != other.id)
			return false;
		if (token == null) {
			if (other.token != null)
				return false;
		} else if (!token.equals(other.token))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AccessToken [id=" + id + ", token=" + token + ", userId="
				+ userId + "]";
	}

}
