package com.zerowaste.model;

import java.util.Collection;

import com.google.api.client.util.Key;

public class Role implements Model {

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
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", users=" + users + ", permissions=" + permissions + "]";
	}

	

}
