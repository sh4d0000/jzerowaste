package com.zerowaste.rest;

public interface OwnedResourceIdentifiable extends BaseResourceIdentifiable{
	
	String getGetURI(Long id, Long ownerId);
	String getAllURI(Long ownerId);
	String getPostURI(Long ownerId);
	String getPutURI(Long ownerId);
	String getDeleteURI(Long ownerId);

}
