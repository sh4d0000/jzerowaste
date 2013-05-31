package com.zerowaste.model;

import java.util.Collection;

import com.google.api.client.util.Key;

public class User implements Model {

	@Key
	private long id;
	@Key
	private String name;
	@Key
	private String surname;
	@Key
	private String nickname;
	@Key
	private String email;
	@Key
	private String password;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname + ", nickname=" + nickname + ", email="
				+ email + ", password=" + password + ", roles=" + roles + "]";
	}
	
}
