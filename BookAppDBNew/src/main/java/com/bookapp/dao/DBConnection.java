package com.bookapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {

	static Connection connection;
	public static Connection openConnection() {
		try {
			String sql = "create table Book(title varchar(20),bookId integer primary key, "
					+ "author varchar(20),category varchar(20),price decimal)";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "system";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url,username,password);
//			PreparedStatement statement = connection.prepareStatement(sql);
//			statement.execute();
//			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return connection;
	}
	public static void closeconnection() {
		if(connection!=null)
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		System.out.println("closeConnection");
	}
}
