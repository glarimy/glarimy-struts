package com.glarimy.struts;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private int isbn;
	private String title;
	private double price;
	private boolean reference;
	private Publisher publisher;
	private List<Author> authors = new ArrayList<>();

	public Book() {

	}

	public Book(int isbn, String title, double price, boolean reference, Publisher publisher) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.reference = reference;
		this.publisher = publisher;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isReference() {
		return reference;
	}

	public void setReference(boolean reference) {
		this.reference = reference;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	public List<Author> getAuthors() {
		return authors;
	}

}
