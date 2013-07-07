package com.zerowaste.model;

import java.util.Collection;

import com.google.api.client.util.Key;
import com.zerowaste.rest.ResourceIdentifiable;

public class Role implements Model, ResourceIdentifiable {

	@Key
	private long id;
	@Key
	private String name;

	private Collection<User> users;
	private Collection<Permission> permissions;

	public Collection<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(Collection<Permission> permissions) {
		this.permissions = permissions;
	}

	public Collection<User> getUsers() {
		return users;
	}

	public void setUsers(Collection<User> users) {
		this.users = users;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getAllURI() {
		return BASE_URI + ROLES_SUB_URI;
	}

	@Override
	public String getPostURI() {
		return BASE_URI + ROLES_SUB_URI;
	}

	@Override
	public String getPutURI() {
		return BASE_URI + ROLES_SUB_URI + id;
	}

	@Override
	public String getDeleteURI() {
		return BASE_URI + ROLES_SUB_URI + id;
	}

	@Override
	public String getGetURI(Long id) {
		return BASE_URI + BASE_URI + id;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", users=" + users + ", permissions=" + permissions + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((permissions == null) ? 0 : permissions.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
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
		Role other = (Role) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		return true;
	}

	

}
