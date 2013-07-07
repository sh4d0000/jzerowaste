package com.zerowaste.model;

import java.util.Collection;

import com.google.api.client.util.Key;
import com.zerowaste.rest.ResourceIdentifiable;

public class Ingredient implements Model, ResourceIdentifiable {

	@Key
	private long id;
	@Key
	private String name;
	
	private Collection<Recipe> recipes;

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

	public Collection<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(Collection<Recipe> recipes) {
		this.recipes = recipes;
	}

	@Override
	public String getGetURI(Long id) {
		return BASE_URI + INGREDIENTS_SUB_URI + id;
	}

	@Override
	public String getAllURI() {
		return BASE_URI + INGREDIENTS_SUB_URI;
	}

	@Override
	public String getPostURI() {
		return BASE_URI + INGREDIENTS_SUB_URI;		
	}

	@Override
	public String getPutURI() {
		return BASE_URI + INGREDIENTS_SUB_URI + id;
	}

	@Override
	public String getDeleteURI() {
		return BASE_URI + INGREDIENTS_SUB_URI + id;
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
		Ingredient other = (Ingredient) obj;
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
		return "Ingredient [id=" + id + ", name=" + name + ", recipes=" + recipes + "]";
	}
	
}
