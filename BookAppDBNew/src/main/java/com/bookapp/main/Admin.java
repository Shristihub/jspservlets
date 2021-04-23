package com.bookapp.main;

import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class Admin {
	public static void main(String[] args) {
//		Book book = new Book("Leadership ",15,"Robin","Self",2000.0);
		BookService service = new BookServiceImpl();
//		service.addBook(book);

		try {
			service.deleteBook(14);
		} catch (IdNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			service.updateBook(19, 900);
		} catch (IdNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
