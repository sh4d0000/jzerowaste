package com.zerowaste.model;

import com.zerowaste.rest.ResourceIdentifiable;

public class RecipeReview implements Model, ResourceIdentifiable {

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
	
	@Override
	public String getGetURI(Long id) {
		return BASE_URI + RECIPE_REVIEWS_SUB_URI + id;
	}

	@Override
	public String getAllURI() {
		return BASE_URI + RECIPE_REVIEWS_SUB_URI;
	}

	@Override
	public String getPostURI() {
		return BASE_URI + RECIPE_REVIEWS_SUB_URI;		
	}

	@Override
	public String getPutURI() {
		return BASE_URI + RECIPE_REVIEWS_SUB_URI + id;
	}

	@Override
	public String getDeleteURI() {
		return BASE_URI + RECIPE_REVIEWS_SUB_URI + id;
	}

	@Override
	public String toString() {
		return "RecipeReview [id=" + id + ", briefReview=" + briefReview + ", review=" + review + ", rating=" + rating
				+ ", recipe=" + recipe + ", user=" + user + "]";
	}

	
	
}
