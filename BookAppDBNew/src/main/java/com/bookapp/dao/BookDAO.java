package com.bookapp.dao;

import java.util.List;

import com.bookapp.model.Book;

public interface BookDAO {
	void addOneBook(Book book);
	int updateOneBook(int bookid, double price);
	int deleteOneBook(int bookid);
	Book findBookById(int bookid) ;
	
	List<Book> findAllBooks();
	List<Book> findBookByAuthor(String author) ;
	List<Book> findBookByCategory(String category) ;

}
