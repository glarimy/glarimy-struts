package com.glarimy.struts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
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
		logger.debug("Added book: " + book);
		return Action.SUCCESS;
	}
}
