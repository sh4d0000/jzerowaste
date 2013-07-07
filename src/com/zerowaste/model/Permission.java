package com.zerowaste.model;

import java.util.Collection;

import com.google.api.client.util.Key;
import com.zerowaste.rest.ResourceIdentifiable;

public class Permission implements Model, ResourceIdentifiable {

	@Key
	private long id;
	@Key
	private String name;
	
	private Collection<Role> roles;

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

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	
	@Override
	public String getGetURI(Long id) {
		return BASE_URI + PERMISSIONS_SUB_URI + id;
	}

	@Override
	public String getAllURI() {
		return BASE_URI + PERMISSIONS_SUB_URI;
	}

	@Override
	public String getPostURI() {
		return BASE_URI + PERMISSIONS_SUB_URI;		
	}

	@Override
	public String getPutURI() {
		return BASE_URI + PERMISSIONS_SUB_URI + id;
	}

	@Override
	public String getDeleteURI() {
		return BASE_URI + PERMISSIONS_SUB_URI + id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Permission other = (Permission) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Permission [id=" + id + ", name=" + name + ", roles=" + roles + "]";
	}
	
}
