package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class TestBookService {

	@Test
	@DisplayName(value = "Test FindBestBook should not Return Null")
	void testFindBestBook() {

		BookService service = new BookService();
		String actual = service.findBestBook("spring","502");
		
		assertNotNull(actual);
	}
	@Test
	@DisplayName(value = "Test FindBestBook should return Head First Java for argument java")
	void testFindBestBookReturnValue() {

		BookService service = new BookService();
		String actual = service.findBestBook("java","405");
		
		assertEquals("Effective Java", actual);;
	}

	@Disabled
	@Test
	@DisplayName(value = "Test FindBestBook should return String length 8 chars")
	void testFindBestBookReturnValueLength() {
		
		BookService service = new BookService();

	}

	@Test
	@DisplayName(value = "Test FindBestBook Method should throw NumberFormatException for values with Numbers")
	void testFindBestBookThrowsException() {

		BookService service = new BookService();
		Throwable exception =
	            assertThrows(NumberFormatException.class, ()-> 
	            service.findBestBook("java","Four"));
		
	}

}
