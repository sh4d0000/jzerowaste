package com.zerowaste.model;

public class LocalReview implements Model {

	private Long id;
	private String briefReview;
	private String review;
	private int overallRating;
	private Local local;
	private User user;
	private int bakingRating;
	private int beerWineRating;
	private int bodyCareRating;
	private int cleaningRating;
	private int condimentsRating;
	private int grainsLegumesRating;
	private int oliveSaladRating;
	private int pastaRating;
	private int petRating;
	private int snacksRating;
	private int spicesTeasRating;
	private int reusableContainersRating;

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

	public int getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getBakingRating() {
		return bakingRating;
	}

	public void setBakingRating(int bakingRating) {
		this.bakingRating = bakingRating;
	}

	public int getBeerWineRating() {
		return beerWineRating;
	}

	public void setBeerWineRating(int beerWineRating) {
		this.beerWineRating = beerWineRating;
	}

	public int getBodyCareRating() {
		return bodyCareRating;
	}

	public void setBodyCareRating(int bodyCareRating) {
		this.bodyCareRating = bodyCareRating;
	}

	public int getCleaningRating() {
		return cleaningRating;
	}

	public void setCleaningRating(int cleaningRating) {
		this.cleaningRating = cleaningRating;
	}

	public int getCondimentsRating() {
		return condimentsRating;
	}

	public void setCondimentsRating(int condimentsRating) {
		this.condimentsRating = condimentsRating;
	}

	public int getGrainsLegumesRating() {
		return grainsLegumesRating;
	}

	public void setGrainsLegumesRating(int grainsLegumesRating) {
		this.grainsLegumesRating = grainsLegumesRating;
	}

	public int getOliveSaladRating() {
		return oliveSaladRating;
	}

	public void setOliveSaladRating(int oliveSaladRating) {
		this.oliveSaladRating = oliveSaladRating;
	}

	public int getPastaRating() {
		return pastaRating;
	}

	public void setPastaRating(int pastaRating) {
		this.pastaRating = pastaRating;
	}

	public int getPetRating() {
		return petRating;
	}

	public void setPetRating(int petRating) {
		this.petRating = petRating;
	}

	public int getSnacksRating() {
		return snacksRating;
	}

	public void setSnacksRating(int snacksRating) {
		this.snacksRating = snacksRating;
	}

	public int getSpicesTeasRating() {
		return spicesTeasRating;
	}

	public void setSpicesTeasRating(int spicesTeasRating) {
		this.spicesTeasRating = spicesTeasRating;
	}

	public int getReusableContainersRating() {
		return reusableContainersRating;
	}

	public void setReusableContainersRating(int reusableContainersRating) {
		this.reusableContainersRating = reusableContainersRating;
	}

}
