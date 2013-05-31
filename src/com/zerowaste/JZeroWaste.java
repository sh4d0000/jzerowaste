package com.zerowaste;

import com.zerowaste.model.Role;
import com.zerowaste.model.User;

public class JZeroWaste {
	
	public static ModelManager<Role> getRoleManager() {
		return new ModelManager<Role>(Role.class);
	}
	
	public static ModelManager<User> getUserManager() {
		return new ModelManager<User>(User.class);
	}

}
