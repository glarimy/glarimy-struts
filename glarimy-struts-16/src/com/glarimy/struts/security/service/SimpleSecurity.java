package com.glarimy.struts.security.service;

import com.glarimy.struts.security.api.AuthenticationFailedException;
import com.glarimy.struts.security.api.Credential;
import com.glarimy.struts.security.api.Security;
import com.glarimy.struts.security.db.SecurityDAO;

public class SimpleSecurity implements Security {
	private SecurityDAO dao = new SecurityDAO();

	@Override
	public void authenticate(Credential credential) throws AuthenticationFailedException {
		if (dao.found(credential))
			return;
		throw new AuthenticationFailedException();
	}
}
