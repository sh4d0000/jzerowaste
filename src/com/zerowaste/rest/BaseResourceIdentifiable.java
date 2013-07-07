package com.zerowaste.rest;

public abstract interface BaseResourceIdentifiable {
	
	String BASE_URI 	= "http://192.168.0.10/zerowaste/";
	String ROLES_SUB_URI 					= "roles/";
	String USERS_SUB_URI 					= "users/";
	String RECIPES_SUB_URI 	 		 		= "recipes/";
	String RECIPE_REVIEWS_SUB_URI 			= "recipes/";
	String LOCAL_REVIEWS_SUB_URI 			= "locals/:local_id/reviews/";
	String ROLE_HAS_PERMISSIONS_SUB_URI 	= "roles/:role_id/permissions/";
	String USER_HAS_ACCESS_TOKEN_SUB_URI 	= "users/:user_id/accesstoken/";
	String USER_HAS_ROLES_SUB_URI 			= "users/:user_id/roles/";
	String RECIPE_HAS_INGRIEDENTS_SUB_URI 	= "recipes/:recipe_id/ingredients/";
	String INGREDIENTS_SUB_URI 				= "ingredients/";
	String LOCALS_SUB_URI 					= "locals/";
	String PERMISSIONS_SUB_URI 				= "permissions/";
	
}
