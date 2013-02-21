package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testBook() {
		Book book = new Book("Great Expectations");
		assertEquals("Great Expectations", book.title);
		assertEquals("unknown author", book.author);
	}
	
	public void testGetPerson() {
		Book b2 = new Book("War and Peace");
		Person p1 = new Person();
		p1.setName("Elvis");
		
		b2.setPerson(p1);
		
//		Person testPerson = b2.getPerson();
//		String testName = testPerson.getName();
		
		String testName = b2.getPerson().getName();
		assertEquals("Elvis", testName);
	}

}
