package com.glarimy.struts;

import java.util.List;

import com.opensymphony.xwork2.Action;

public class BookList {
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
}
