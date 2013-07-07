package com.zerowaste.rest;

public interface ResourceIdentifiable extends BaseResourceIdentifiable{
	
	String getGetURI(Long id);
	String getAllURI();
	String getPostURI();
	String getPutURI();
	String getDeleteURI();

}
