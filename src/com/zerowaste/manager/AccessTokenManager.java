package com.zerowaste.manager;

import java.io.IOException;
import java.util.Collection;

import com.zerowaste.model.AccessToken;

public class AccessTokenManager extends OwnedModelManager<AccessToken> {

	public AccessTokenManager() {
		super(AccessToken.class);
	}
	
	public AccessToken getAccessToken(long userId) throws IOException, InstantiationException, IllegalAccessException {

		Collection<AccessToken> all = getAll(userId);
		for (AccessToken accessToken : all) {
			return accessToken;
		}
		
		return null;
	}

}
