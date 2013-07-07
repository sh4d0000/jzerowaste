package com.zerowaste.model;

import java.util.Collection;

import com.google.api.client.util.Key;
import com.zerowaste.rest.ResourceIdentifiable;

public class Local implements Model, ResourceIdentifiable {

	@Key
	private long id;
	@Key
	private String name;
	@Key
	private String address;
	@Key
	private String phone;
	@Key
	private String website;
	@Key
	private String latitude;
	@Key
	private String longitude;
	@Key("user_id")
	private Long userId;
	
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
	
	@Override
	public String getGetURI(Long id) {
		return BASE_URI + LOCALS_SUB_URI + id;
	}

	@Override
	public String getAllURI() {
		return BASE_URI + LOCALS_SUB_URI;
	}

	@Override
	public String getPostURI() {
		return BASE_URI + LOCALS_SUB_URI;		
	}

	@Override
	public String getPutURI() {
		return BASE_URI + LOCALS_SUB_URI + id;
	}

	@Override
	public String getDeleteURI() {
		return BASE_URI + LOCALS_SUB_URI + id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((latitude == null) ? 0 : latitude.hashCode());
		result = prime * result
				+ ((longitude == null) ? 0 : longitude.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((website == null) ? 0 : website.hashCode());
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
		Local other = (Local) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (latitude == null) {
			if (other.latitude != null)
				return false;
		} else if (!latitude.equals(other.latitude))
			return false;
		if (longitude == null) {
			if (other.longitude != null)
				return false;
		} else if (!longitude.equals(other.longitude))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (website == null) {
			if (other.website != null)
				return false;
		} else if (!website.equals(other.website))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Local [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + ", website="
				+ website + ", latitude=" + latitude + ", longitude=" + longitude + ", owner=" + owner + ", recipes="
				+ recipes + "]";
	}

}
