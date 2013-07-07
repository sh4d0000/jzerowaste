package com.zerowaste.model;

import java.util.Collection;

import com.google.api.client.util.Key;
import com.zerowaste.rest.ResourceIdentifiable;

public class Recipe implements Model, ResourceIdentifiable {

	@Key
	private long id;
	@Key
	private String name;
	@Key
	private String preparation;
	@Key
	private String notes;
	@Key
	private int difficulty;
	@Key("cooking_time")
	private int cookingTime;
	@Key("preparation_time")
	private int preparationTime;
	@Key("dosage_for")
	private int dosageFor;
	@Key("local_id")
	private long localId;
	
	private Local local;
	private Collection<Ingredient> ingredients;

	public Collection<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Collection<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
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

	public String getPreparation() {
		return preparation;
	}

	public void setPreparation(String preparation) {
		this.preparation = preparation;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public int getCookingTime() {
		return cookingTime;
	}

	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}

	public int getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(int preparationTime) {
		this.preparationTime = preparationTime;
	}

	public int getDosageFor() {
		return dosageFor;
	}

	public void setDosageFor(int dosageFor) {
		this.dosageFor = dosageFor;
	}
	
	@Override
	public String getGetURI(Long id) {
		return BASE_URI + RECIPES_SUB_URI + id;
	}

	@Override
	public String getAllURI() {
		return BASE_URI + RECIPES_SUB_URI;
	}

	@Override
	public String getPostURI() {
		return BASE_URI + RECIPES_SUB_URI;		
	}

	@Override
	public String getPutURI() {
		return BASE_URI + RECIPES_SUB_URI + id;
	}

	@Override
	public String getDeleteURI() {
		return BASE_URI + RECIPES_SUB_URI + id;
	}
	
	public Long getLocalId() {
		return localId;
	}

	public void setLocalId(Long localId) {
		this.localId = localId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cookingTime;
		result = prime * result + difficulty;
		result = prime * result + dosageFor;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (localId ^ (localId >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result
				+ ((preparation == null) ? 0 : preparation.hashCode());
		result = prime * result + preparationTime;
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
		Recipe other = (Recipe) obj;
		if (cookingTime != other.cookingTime)
			return false;
		if (difficulty != other.difficulty)
			return false;
		if (dosageFor != other.dosageFor)
			return false;
		if (id != other.id)
			return false;
		if (localId != other.localId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (notes == null) {
			if (other.notes != null)
				return false;
		} else if (!notes.equals(other.notes))
			return false;
		if (preparation == null) {
			if (other.preparation != null)
				return false;
		} else if (!preparation.equals(other.preparation))
			return false;
		if (preparationTime != other.preparationTime)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", name=" + name + ", preparation=" + preparation + ", notes=" + notes
				+ ", difficulty=" + difficulty + ", cookingTime=" + cookingTime + ", preparationTime="
				+ preparationTime + ", dosageFor=" + dosageFor + ", local=" + local + ", ingredients=" + ingredients
				+ "]";
	}

}
