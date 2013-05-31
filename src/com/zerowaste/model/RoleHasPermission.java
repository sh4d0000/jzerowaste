package com.zerowaste.model;

import com.google.api.client.util.Key;

public class RoleHasPermission implements Model {

	@Key
	private long id;
	@Key("permission_id")
	private long permissionId;
	@Key("role_id")
	private long roleId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(long permissionId) {
		this.permissionId = permissionId;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

}
