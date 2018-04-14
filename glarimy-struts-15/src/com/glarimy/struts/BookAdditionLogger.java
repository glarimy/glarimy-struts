package com.glarimy.struts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class BookAdditionLogger extends AbstractInterceptor {
	private Logger logger = LogManager.getLogger(BookAdditionLogger.class);

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		String result = invocation.invoke();
		if (invocation.getProxy().getActionName().equals("add") && result.equalsIgnoreCase(Action.SUCCESS)) {
			AddBookAction action = (AddBookAction) invocation.getAction();
			logger.debug("Successfully added book : " + action.getBook().getIsbn() + " [ " + action.getBook().getTitle()
					+ " ]");
		}
		return result;
	}

}
