package com.bookapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookapp.exceptions.AuthorNotFoundException;
import com.bookapp.exceptions.CategoryNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;

public class BookDAOImpl implements BookDAO {

	public void addOneBook(Book book) {
		String sql = "insert into book values(?,?,?,?,?)";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, book.getTitle());
			statement.setInt(2, book.getBookid());
			statement.setString(3, book.getAuthor());
			statement.setString(4, book.getCategory());
			statement.setDouble(5, book.getPrice());
			statement.execute();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();
		}

	}

	public int updateOneBook(int bookid, double price) {
		String sql = "update Book set price=? where bookid=?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		int result = 0;
		try {
			statement = connection.prepareStatement(sql);
			statement.setDouble(1, price);
			statement.setInt(2, bookid);
			result = statement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();
		}
		return result;
	}

	public int deleteOneBook(int bookid)  {
		String sql = "delete from Book where bookid=?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		int result = 0;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, bookid);
			result = statement.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();
		}
		return result;
	}

	public Book findBookById(int bookid)  {
		String sql = "select * from book where bookid=?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		Book book = null;
		try {
			statement = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
			statement.setInt(1, bookid);
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
			  String title = rs.getString("title");
			  String author1 = rs.getString("author");
			  String category = rs.getString("category");
			  double price = rs.getDouble("price");			
			 book = new Book(title, bookid, author1, category, price);
			}			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(statement!=null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();		
	}
		return book;


	}

	public List<Book> findAllBooks() {
		String sql = "select * from book";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		List<Book> bookList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = statement.executeQuery();
			//rs.beforeFirst();
			while(rs.next()) {
			  String title = rs.getString("title");
			  String author = rs.getString("author");
			  String category = rs.getString("category");
			  int bookid = rs.getInt(2);
			  double price = rs.getDouble("price");			
			 Book book = new Book(title, bookid, author, category, price);
			 bookList.add(book);
			}			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(statement!=null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();		
	}
		return bookList;

	}

	public List<Book> findBookByAuthor(String choice)  {
		String sql = "select * from book where author like ? or category like ?  or title like ?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		List<Book> bookList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
			statement.setString(1, "%"+choice+"%");
			statement.setString(2, "%"+choice+"%");
			statement.setString(3, "%"+choice+"%");
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
			  String title = rs.getString("title");
			  String author1 = rs.getString("author");
			  String category = rs.getString("category");
			  int bookid = rs.getInt(2);
			  double price = rs.getDouble("price");			
			 Book book = new Book(title, bookid, author1, category, price);
			 bookList.add(book);
			}			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(statement!=null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();		
	}
		return bookList;

	}

	public List<Book> findBookByCategory(String category)  {
		String sql = "select * from book where category=?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		List<Book> bookList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
			statement.setString(1, category);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
			  String title = rs.getString("title");
			  String author = rs.getString("author");
			  int bookid = rs.getInt(2);
			  double price = rs.getDouble("price");			
			 Book book = new Book(title, bookid, author, category, price);
			 bookList.add(book);
			}			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(statement!=null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeconnection();		
	}
		return bookList;


	}

}
