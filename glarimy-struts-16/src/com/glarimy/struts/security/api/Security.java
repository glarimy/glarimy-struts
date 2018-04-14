package com.glarimy.struts.security.api;

public interface Security {
	public void authenticate(Credential credential) throws AuthenticationFailedException;
}
