package org.totalbeginner.tutorial;

import junit.framework.TestCase;

public class BookTest extends TestCase {

	public void testBook() {
		Book book = new Book("Great Expectations");
		assertEquals("Great Expectations", book.title);
		assertEquals("unknown author", book.author);
	}

}
