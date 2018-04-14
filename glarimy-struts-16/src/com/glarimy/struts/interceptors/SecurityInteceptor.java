package com.glarimy.struts.interceptors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SecurityInteceptor extends AbstractInterceptor {
	private Logger logger = LogManager.getLogger(SecurityInteceptor.class);

	public SecurityInteceptor() {
		System.out.println("security interceptor cons");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("intercepeting");
		logger.debug("checking for login context");
		if (ActionContext.getContext().getSession().get("uid") == null) {
			logger.debug("forcing for login");
			return Action.LOGIN;
		}
		logger.debug("proceeding to the action");
		return invocation.invoke();
	}
}
