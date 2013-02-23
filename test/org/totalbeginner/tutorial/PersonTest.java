package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person person = new Person();
		assertEquals("unknown name", person.getName());
		assertEquals(3, person.getMaximumBooks());
	}
	
	public void testSetName() {
		Person person = new Person();
		person.setName("Fred");
		assertEquals("Fred", person.getName());
	}

	public void testSetMaximumBooks() {
		Person person = new Person();
		person.setMaximumBooks(5);
		assertEquals(5, person.getMaximumBooks());
	}
	
	public void testToString() {
		Person person = new Person();
		person.setName("Fred Flintstone");
		person.setMaximumBooks(7);
		String testString = "Fred Flintstone (7 books)";
		assertEquals(testString, person.toString());
	}

}
