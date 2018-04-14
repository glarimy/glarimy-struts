package com.glarimy.struts;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;

public class BookList {
	private List<Book> books = new ArrayList<>();

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String execute() {
		Author krishna = new Author("Krishna Mohan Koyya", "krishna@glarimy.com");
		Author vishnu = new Author("Vishnu Teja Koyya", "vishunu.koyya@gmail.com");
		Author amol = new Author("Amol Sriram Koyya", "amol.koyya@gmail.com");

		Book java = new Book(1234, "Java Threads", 100, true, new Publisher("GTS", 9731423166L));
		java.getAuthors().add(krishna);

		Book fiction = new Book(2345, "Twins", 50, false, new Publisher("GTS", 9731423166L));
		fiction.getAuthors().add(vishnu);
		fiction.getAuthors().add(amol);

		books.add(java);
		books.add(fiction);
		return Action.SUCCESS;
	}
}
