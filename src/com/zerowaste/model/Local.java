package com.zerowaste.model;

import java.util.Collection;

public class Local implements Model {

	private Long id;
	private String name;
	private String address;
	private String phone;
	private String website;
	private String latitude;
	private String longitude;
	private User owner;
	private Collection<Recipe> recipes;

	public Collection<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(Collection<Recipe> recipes) {
		this.recipes = recipes;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

}
