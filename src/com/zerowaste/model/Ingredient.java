package com.zerowaste.model;

import java.util.Collection;

public class Ingredient implements Model {

	private Long id;
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

}
