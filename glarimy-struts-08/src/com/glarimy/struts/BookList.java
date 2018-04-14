package com.glarimy.struts;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class BookList extends ActionSupport {
	private Library library = new Library();
	private List<Book> books;
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

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

	public String add() {
		library.add(book);
		books = library.list();
		return Action.SUCCESS;
	}

	@Override
	public void validate() {
		if (book == null)
			return;
		if (book.getTitle() == null || book.getTitle().trim().length() == 0)
			addFieldError("book.title", "Invalid book title");
		if (book.getIsbn() <= 0)
			addFieldError("book.isbn", "Invalid ISBN number");
		if (book.getPrice() < 0)
			addFieldError("book.price", "Invalid price");
		if (!getFieldErrors().values().isEmpty())
			addActionError("Invalid values entered. Retry!");
	}
}
