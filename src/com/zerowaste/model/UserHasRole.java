package com.zerowaste.model;

import com.google.api.client.util.Key;

public class UserHasRole implements Model {

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

}
