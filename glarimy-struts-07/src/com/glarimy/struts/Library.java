package com.glarimy.struts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
	private static Map<Integer, Book> books = new HashMap<>();

	public Library() {
		Author krishna = new Author("Krishna Mohan Koyya", "krishna@glarimy.com");
		Author vishnu = new Author("Vishnu Teja Koyya", "vishunu.koyya@gmail.com");
		Author amol = new Author("Amol Sriram Koyya", "amol.koyya@gmail.com");

		Book java = new Book(1234, "Java Threads", 100, false, new Publisher("GTS", 9731423166L));
		java.getAuthors().add(krishna);
		Book js = new Book(2345, "JavaScript", 50, false, new Publisher("GTS", 9731423166L));
		js.getAuthors().add(krishna);
		Book ng = new Book(3456, "AngularJS", 80, false, new Publisher("GTS", 9731423166L));
		ng.getAuthors().add(krishna);

		Book story = new Book(4567, "Twins", 50, true, new Publisher("GTS", 9731423166L));
		story.getAuthors().add(vishnu);
		story.getAuthors().add(amol);
		Book novel = new Book(5678, "Twins", 50, true, new Publisher("GTS", 9731423166L));
		novel.getAuthors().add(vishnu);

		books.put(1234, java);
		books.put(2345, js);
		books.put(3456, ng);
		books.put(4567, story);
		books.put(5678, novel);

	}

	public void add(Book book) {
		books.put(book.getIsbn(), book);
	}

	public List<Book> list() {
		return new ArrayList<>(books.values());
	}

	public void remove(int isbn) {
		books.remove(isbn);
	}

	public void update(Book book) {
		books.put(book.getIsbn(), book);
	}
}
