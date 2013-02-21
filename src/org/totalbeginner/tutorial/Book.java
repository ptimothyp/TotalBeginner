package org.totalbeginner.tutorial;

public class Book {

	String author;
	String title;
	private Person person;

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

	public void setPerson(Person person) {
		this.person = person;
		
	}

	public Person getPerson() {
		return this.person;
	}

}
