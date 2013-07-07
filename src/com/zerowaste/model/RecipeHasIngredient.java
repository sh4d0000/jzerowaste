package com.zerowaste.model;

import com.google.api.client.util.Key;
import com.zerowaste.rest.OwnedResourceIdentifiable;

public class RecipeHasIngredient implements OwnedModel, OwnedResourceIdentifiable {

	@Key
	private long id;
	@Key("recipe_id")
	private long recipeId;
	@Key("ingredient_id")
	private long ingredientId;
	@Key
	private String quota;

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
	
	@Override
	public String getGetURI(Long recipeId, Long id) {
		return BASE_URI + RECIPE_HAS_INGRIEDENTS_SUB_URI.replace(":recipe_id", recipeId.toString()) + id;
	}

	@Override
	public String getAllURI(Long recipeId) {
		return BASE_URI + RECIPE_HAS_INGRIEDENTS_SUB_URI.replace(":recipe_id", recipeId.toString());
	}

	@Override
	public String getPostURI(Long recipeId) {
		return BASE_URI + RECIPE_HAS_INGRIEDENTS_SUB_URI.replace(":recipe_id", recipeId.toString());		
	}

	@Override
	public String getPutURI(Long recipeId) {
		return BASE_URI + RECIPE_HAS_INGRIEDENTS_SUB_URI.replace(":recipe_id", recipeId.toString()) + id;
	}

	@Override
	public String getDeleteURI(Long recipeId) {
		return BASE_URI + RECIPE_HAS_INGRIEDENTS_SUB_URI.replace(":recipe_id", recipeId.toString()) + id;
	}
	
	@Override
	public Long getOwnerId() {
		return ingredientId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (ingredientId ^ (ingredientId >>> 32));
		result = prime * result + ((quota == null) ? 0 : quota.hashCode());
		result = prime * result + (int) (recipeId ^ (recipeId >>> 32));
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
		RecipeHasIngredient other = (RecipeHasIngredient) obj;
		if (id != other.id)
			return false;
		if (ingredientId != other.ingredientId)
			return false;
		if (quota == null) {
			if (other.quota != null)
				return false;
		} else if (!quota.equals(other.quota))
			return false;
		if (recipeId != other.recipeId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RecipeHasIngredient [id=" + id + ", recipeId=" + recipeId
				+ ", ingredientId=" + ingredientId + ", quota=" + quota + "]";
	}
	
}
