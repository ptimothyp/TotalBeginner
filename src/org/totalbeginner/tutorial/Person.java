package org.totalbeginner.tutorial;

public class Person {
	// fields
	private String name; // name of the person
	private int maximumBooks; // max books person can checkout

	// construction
	public Person() {
		name = "unknown name";
		maximumBooks = 3;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxBooks() {
		return maximumBooks;
	}

	public void setMaxBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	public String toString() {
		return this.getName() + " (" + this.getMaxBooks() + " books)";
				
	}
}