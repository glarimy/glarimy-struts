package com.glarimy.struts;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;

public class BookList {
	private List<Book> textbooks = new ArrayList<>();
	private List<Book> references = new ArrayList<>();

	public List<Book> getTextbooks() {
		return textbooks;
	}

	public void setTextbooks(List<Book> textbooks) {
		this.textbooks = textbooks;
	}

	public List<Book> getReferences() {
		return references;
	}

	public void setReferences(List<Book> references) {
		this.references = references;
	}

	public String execute() {
		Author krishna = new Author("Krishna Mohan Koyya", "krishna@glarimy.com");
		Author vishnu = new Author("Vishnu Teja Koyya", "vishunu.koyya@gmail.com");
		Author amol = new Author("Amol Sriram Koyya", "amol.koyya@gmail.com");

		Book java = new Book(1234, "Java Threads", 100, false, new Publisher("GTS", 9731423166L));
		java.getAuthors().add(krishna);
		Book js = new Book(1234, "JavaScript", 50, false, new Publisher("GTS", 9731423166L));
		js.getAuthors().add(krishna);
		Book ng = new Book(1234, "AngularJS", 80, false, new Publisher("GTS", 9731423166L));
		ng.getAuthors().add(krishna);

		Book story = new Book(2345, "Twins", 50, true, new Publisher("GTS", 9731423166L));
		story.getAuthors().add(vishnu);
		story.getAuthors().add(amol);
		Book novel = new Book(2345, "Twins", 50, true, new Publisher("GTS", 9731423166L));
		novel.getAuthors().add(vishnu);

		textbooks.add(java);
		textbooks.add(js);
		textbooks.add(ng);
		references.add(story);
		references.add(novel);
		return Action.SUCCESS;
	}
}
