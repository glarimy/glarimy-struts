package com.glarimy.struts;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class BookListAction extends ActionSupport {
	static final Logger log = LogManager.getLogger(BookListAction.class);
	private Library library = new Library();
	private List<Book> books;

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String list() {
		log.debug("fetching list of books");
		books = library.list();
		log.debug("fetched books: " + books);
		return Action.SUCCESS;
	}
}
