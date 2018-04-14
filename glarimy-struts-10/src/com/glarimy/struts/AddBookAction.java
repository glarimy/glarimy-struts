package com.glarimy.struts;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class AddBookAction extends ActionSupport {
	private Library library = new Library();
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String add() {
		library.add(book);
		return Action.SUCCESS;
	}
}
