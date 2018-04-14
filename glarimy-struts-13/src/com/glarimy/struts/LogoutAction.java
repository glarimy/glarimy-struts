package com.glarimy.struts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class LogoutAction {
	private Logger logger = LogManager.getLogger(LogoutAction.class);

	public String execute() {
		logger.debug("Invalidating the session");
		ActionContext.getContext().getSession().clear();
		logger.debug("Invalidated the session");
		return Action.SUCCESS;
	}
}
