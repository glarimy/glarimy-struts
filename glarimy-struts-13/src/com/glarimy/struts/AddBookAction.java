package com.glarimy.struts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddBookAction extends ActionSupport {
	private Logger logger = LogManager.getLogger(AddBookAction.class);
	private Library library = new Library();
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String add() {
		logger.debug("Adding book: " + book);
		library.add(book);
		if (ActionContext.getContext().getSession().get("count") == null)
			ActionContext.getContext().getSession().put("count", 1);
		else {
			int count = (Integer) ActionContext.getContext().getSession().get("count");
			count++;
			ActionContext.getContext().getSession().put("count", count);
		}

		logger.debug("Books added in this session:" + ActionContext.getContext().getSession().get("count"));
		logger.debug("Added book: " + book);
		return Action.SUCCESS;
	}
}
