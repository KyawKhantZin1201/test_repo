package com.demo.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConnectionManager {
	
	Connection getConnection() throws SQLException;
	
	String URL = "jdbc:mysql://localhost:3306/message_db";
	String USER = "root";
	String PWD = "admin";
	
	
	static ConnectionManager getInstnace() {
		return() -> DriverManager.getConnection(URL,USER,PWD);
	}
}
