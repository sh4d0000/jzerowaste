package com.zerowaste.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.google.api.client.util.Key;
import com.zerowaste.rest.OwnedResourceIdentifiable;

public class RoleHasPermission implements OwnedModel, OwnedResourceIdentifiable {

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
	
	@Override
	public String getGetURI(Long id, Long roleId) {
		return BASE_URI + ROLE_HAS_PERMISSIONS_SUB_URI.replace(":role_id", roleId.toString()) + id;
	}

	@Override
	public String getAllURI(Long roleId) {
		return BASE_URI + ROLE_HAS_PERMISSIONS_SUB_URI.replace(":role_id", roleId.toString());
	}

	@Override
	public String getPostURI(Long roleId) {
		return BASE_URI + ROLE_HAS_PERMISSIONS_SUB_URI.replace(":role_id", roleId.toString());		
	}

	@Override
	public String getPutURI(Long roleId) {
		throw new NotImplementedException();
		//return BASE_URI + ROLE_HAS_PERMISSIONS_SUB_URI.replace(":role_id", roleId.toString()) + id;
	}

	@Override
	public String getDeleteURI(Long roleId) {
		return BASE_URI + ROLE_HAS_PERMISSIONS_SUB_URI.replace(":role_id", roleId.toString()) + permissionId;
	}
	
	@Override
	public Long getOwnerId() {
		return roleId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (permissionId ^ (permissionId >>> 32));
		result = prime * result + (int) (roleId ^ (roleId >>> 32));
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
		RoleHasPermission other = (RoleHasPermission) obj;
		if (id != other.id)
			return false;
		if (permissionId != other.permissionId)
			return false;
		if (roleId != other.roleId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RoleHasPermission [id=" + id + ", permissionId=" + permissionId + ", roleId=" + roleId + "]";
	}

}
