package com.bookapp.main;

import com.bookapp.exceptions.AuthorNotFoundException;
import com.bookapp.exceptions.CategoryNotFoundException;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {

		BookService service = new BookServiceImpl();
		service.getAllBooks().forEach(System.out::println);
		System.out.println("by author");
		
		try {
			service.getBookByAuthor("Kathyee").forEach(System.out::println);
		} catch (AuthorNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			service.getBookByCategory("Techee").forEach(System.out::println);
		} catch (CategoryNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
