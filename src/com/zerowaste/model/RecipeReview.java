package com.zerowaste.model;

public class RecipeReview implements Model {

	private Long id;
	private String briefReview;
	private String review;
	private int rating;
	private Recipe recipe;
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBriefReview() {
		return briefReview;
	}

	public void setBriefReview(String briefReview) {
		this.briefReview = briefReview;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
