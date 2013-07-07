package com.zerowaste;

import com.zerowaste.manager.AccessTokenManager;
import com.zerowaste.manager.ModelManager;
import com.zerowaste.manager.OwnedModelManager;
import com.zerowaste.manager.UserManager;
import com.zerowaste.model.Ingredient;
import com.zerowaste.model.Local;
import com.zerowaste.model.LocalReview;
import com.zerowaste.model.Permission;
import com.zerowaste.model.Recipe;
import com.zerowaste.model.RecipeHasIngredient;
import com.zerowaste.model.Role;
import com.zerowaste.model.RoleHasPermission;
import com.zerowaste.model.UserHasRole;

public class JZeroWaste {
	
	public static ModelManager<Role> getRoleManager() {
		return new ModelManager<Role>(Role.class);
	}
	
	public static UserManager getUserManager() {
		return new UserManager();
	}
	
	public static ModelManager<Local> getLocalManager() {
		return new ModelManager<Local>(Local.class);
	}
	
	public static ModelManager<Recipe> getRecipeManager() {
		return new ModelManager<Recipe>(Recipe.class);
	}
	
	public static ModelManager<Ingredient> getIngredientManager() {
		return new ModelManager<Ingredient>(Ingredient.class);
	}
	
	public static ModelManager<Permission> getPermissionManager() {
		return new ModelManager<Permission>(Permission.class);
	}
	
	public static OwnedModelManager<RoleHasPermission> getRoleHasPermissionManager() {
		return new OwnedModelManager<RoleHasPermission>(RoleHasPermission.class);
	}
	
	public static OwnedModelManager<UserHasRole> getUserHasRoleManager() {
		return new OwnedModelManager<UserHasRole>(UserHasRole.class);
	}
	
	public static OwnedModelManager<RecipeHasIngredient> getRecipeHasIngredientManager() {
		return new OwnedModelManager<RecipeHasIngredient>(RecipeHasIngredient.class);
	}
	
	public static OwnedModelManager<LocalReview> getLocalReviewManager() {
		return new OwnedModelManager<LocalReview>(LocalReview.class);
	}
	
	public static AccessTokenManager getAccessTokenManager() {
		return new AccessTokenManager();
	}
	
}
