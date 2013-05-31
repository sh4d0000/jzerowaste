package com.zerowaste.model;

import java.util.Collection;

public class Recipe implements Model {

	private Long id;
	private String name;
	private String preparation;
	private String notes;
	private int difficulty;
	private int cookingTime;
	private int preparationTime;
	private int dosageFor;
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

}
