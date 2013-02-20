package org.totalbeginner.tutorial;

public class Book {

	public String author;
	public String title;

	public Book(String title) {
		this.title = title;
		this.author = "unknown author";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

}
