package com.zerowaste.model;

import com.google.api.client.util.Key;
import com.zerowaste.rest.OwnedResourceIdentifiable;

public class LocalReview implements OwnedModel, OwnedResourceIdentifiable {

	@Key
	private long id;
	@Key("brief_review")
	private String briefReview;
	@Key
	private String review;
	@Key("local_id")
	private long localId;
	@Key("user_id")
	private long userId;
	@Key("overall_rating")
	private int overallRating;
	@Key("baking_rating")
	private int bakingRating;
	@Key("beer_wine_rating")
	private int beerWineRating;
	@Key("body_care_rating")
	private int bodyCareRating;
	@Key("cleaning_rating")
	private int cleaningRating;
	@Key("condiments_rating")
	private int condimentsRating;
	@Key("grains_legumes_rating")
	private int grainsLegumesRating;
	@Key("olive_salad_rating")
	private int oliveSaladRating;
	@Key("pasta_rating")
	private int pastaRating;
	@Key("pet_rating")
	private int petRating;
	@Key("snacks_rating")
	private int snacksRating;
	@Key("spices_teas_rating")
	private int spicesTeasRating;
	@Key("reusable_containers")
	private int reusableContainers;

	private Local local;
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

	public int getReusableContainers() {
		return reusableContainers;
	}

	public void setReusableContainers(int reusableContainers) {
		this.reusableContainers = reusableContainers;
	}
	
	public void setLocalId(Long localId) {
		this.localId = localId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String getGetURI(Long localId, Long id ) {
		return BASE_URI + LOCAL_REVIEWS_SUB_URI.replace(":local_id", localId.toString()) + id;
	}

	@Override
	public String getAllURI(Long localId) {
		return BASE_URI + LOCAL_REVIEWS_SUB_URI.replace(":local_id", localId.toString());
	}

	@Override
	public String getPostURI(Long localId) {
		return BASE_URI + LOCAL_REVIEWS_SUB_URI.replace(":local_id", localId.toString());		
	}

	@Override
	public String getPutURI(Long localId) {
		return BASE_URI + LOCAL_REVIEWS_SUB_URI.replace(":local_id", localId.toString()) + id;
	}

	@Override
	public String getDeleteURI(Long localId) {
		return BASE_URI + LOCAL_REVIEWS_SUB_URI.replace(":local_id", localId.toString()) + id;
	}

	@Override
	public Long getOwnerId() {
		return localId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bakingRating;
		result = prime * result + beerWineRating;
		result = prime * result + bodyCareRating;
		result = prime * result
				+ ((briefReview == null) ? 0 : briefReview.hashCode());
		result = prime * result + cleaningRating;
		result = prime * result + condimentsRating;
		result = prime * result + grainsLegumesRating;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + (int) (localId ^ (localId >>> 32));
		result = prime * result + oliveSaladRating;
		result = prime * result + overallRating;
		result = prime * result + pastaRating;
		result = prime * result + petRating;
		result = prime * result + reusableContainers;
		result = prime * result + ((review == null) ? 0 : review.hashCode());
		result = prime * result + snacksRating;
		result = prime * result + spicesTeasRating;
		result = prime * result + (int) (userId ^ (userId >>> 32));
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
		LocalReview other = (LocalReview) obj;
		if (bakingRating != other.bakingRating)
			return false;
		if (beerWineRating != other.beerWineRating)
			return false;
		if (bodyCareRating != other.bodyCareRating)
			return false;
		if (briefReview == null) {
			if (other.briefReview != null)
				return false;
		} else if (!briefReview.equals(other.briefReview))
			return false;
		if (cleaningRating != other.cleaningRating)
			return false;
		if (condimentsRating != other.condimentsRating)
			return false;
		if (grainsLegumesRating != other.grainsLegumesRating)
			return false;
		if (id != other.id)
			return false;
		if (localId != other.localId)
			return false;
		if (oliveSaladRating != other.oliveSaladRating)
			return false;
		if (overallRating != other.overallRating)
			return false;
		if (pastaRating != other.pastaRating)
			return false;
		if (petRating != other.petRating)
			return false;
		if (reusableContainers != other.reusableContainers)
			return false;
		if (review == null) {
			if (other.review != null)
				return false;
		} else if (!review.equals(other.review))
			return false;
		if (snacksRating != other.snacksRating)
			return false;
		if (spicesTeasRating != other.spicesTeasRating)
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LocalReview [id=" + id + ", briefReview=" + briefReview
				+ ", review=" + review + ", localId=" + localId + ", userId="
				+ userId + ", overallRating=" + overallRating
				+ ", bakingRating=" + bakingRating + ", beerWineRating="
				+ beerWineRating + ", bodyCareRating=" + bodyCareRating
				+ ", cleaningRating=" + cleaningRating + ", condimentsRating="
				+ condimentsRating + ", grainsLegumesRating="
				+ grainsLegumesRating + ", oliveSaladRating="
				+ oliveSaladRating + ", pastaRating=" + pastaRating
				+ ", petRating=" + petRating + ", snacksRating=" + snacksRating
				+ ", spicesTeasRating=" + spicesTeasRating
				+ ", reusableContainers=" + reusableContainers
				+ "]";
	}

	

}
