package com.zerowaste.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.google.api.client.util.Key;
import com.zerowaste.rest.OwnedResourceIdentifiable;

public class UserHasRole implements OwnedModel, OwnedResourceIdentifiable {

	@Key
	private long id;
	@Key("user_id")
	private long userId;
	@Key("role_id")
	private long roleId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	
	@Override
	public String getGetURI(Long userId, Long id) {
		return BASE_URI + USER_HAS_ROLES_SUB_URI.replace(":user_id", userId.toString()) + id;
	}

	@Override
	public String getAllURI(Long userId) {
		return BASE_URI + USER_HAS_ROLES_SUB_URI.replace(":user_id", userId.toString());
	}

	@Override
	public String getPostURI(Long userId) {
		return BASE_URI + USER_HAS_ROLES_SUB_URI.replace(":user_id", userId.toString());		
	}

	@Override
	public String getPutURI(Long userId) {
		throw new NotImplementedException();
		//return BASE_URI + USER_HAS_ROLES_SUB_URI.replace(":user_id", userId.toString()) + id;
	}

	@Override
	public String getDeleteURI(Long userId) {
		return BASE_URI + USER_HAS_ROLES_SUB_URI.replace(":user_id", userId.toString()) + id;
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
		result = prime * result + (int) (roleId ^ (roleId >>> 32));
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
		UserHasRole other = (UserHasRole) obj;
		if (id != other.id)
			return false;
		if (roleId != other.roleId)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserHasRole [id=" + id + ", userId=" + userId + ", roleId=" + roleId + "]";
	}

}
