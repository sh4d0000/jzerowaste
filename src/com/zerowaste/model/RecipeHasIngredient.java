package com.zerowaste.model;

import com.google.api.client.util.Key;

public class RecipeHasIngredient implements Model {

	@Key
	private long id;
	@Key("recipe_id")
	private long recipeId;
	@Key("ingredient_id")
	private long ingredientId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(long recipeId) {
		this.recipeId = recipeId;
	}

	public long getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(long ingredientId) {
		this.ingredientId = ingredientId;
	}

}
