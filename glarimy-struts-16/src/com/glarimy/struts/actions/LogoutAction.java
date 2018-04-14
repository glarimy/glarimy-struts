package com.glarimy.struts.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {
	public String logout() {
		ActionContext.getContext().getSession().clear();
		return Action.SUCCESS;
	}
}
