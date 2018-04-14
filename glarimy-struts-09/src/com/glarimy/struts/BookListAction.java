package com.glarimy.struts;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class BookListAction extends ActionSupport {
	private Library library = new Library();
	private List<Book> books;
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String list() {
		books = library.list();
		return Action.SUCCESS;
	}
}
