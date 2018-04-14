package com.glarimy.struts.actions;

import com.glarimy.struts.security.api.AuthenticationFailedException;
import com.glarimy.struts.security.api.Credential;
import com.glarimy.struts.security.api.Security;
import com.glarimy.struts.security.service.SimpleSecurity;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private Credential credential;

	public Credential getCredential() {
		return credential;
	}

	public void setCredential(Credential credential) {
		this.credential = credential;
	}

	public String login() {
		Security security = new SimpleSecurity();
		try {
			security.authenticate(credential);
			ActionContext.getContext().getSession().put("uid", credential.getUid());
			return Action.SUCCESS;
		} catch (AuthenticationFailedException afe) {
			return Action.LOGIN;
		}
	}
}
