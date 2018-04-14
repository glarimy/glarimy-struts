package com.glarimy.struts.security.db;

import java.util.HashMap;
import java.util.Map;

import com.glarimy.struts.security.api.Credential;

public class SecurityDAO {
	private static Map<String, String> credentials = new HashMap<>();

	public SecurityDAO() {
		credentials.put("koyya", "123456");
	}

	public boolean found(Credential credential) {
		String password = credentials.get(credential.getUid());
		if (password == null)
			return false;
		if (password.equals(credential.getPwd()))
			return true;
		return false;

	}
}
