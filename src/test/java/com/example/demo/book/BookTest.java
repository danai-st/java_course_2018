package com.example.demo.book;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

	@Test
	public void createBookWithCConstructor() {
		Book book1 = new Book("H1", 8, 2);
		Book book2 = new Book("H1", 8, 2);
		assertEquals(book1, book2);
	}

}
