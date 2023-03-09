package com.jdc.dao;

import java.sql.SQLException;

import com.demo.connection.ConnectionManager;
import com.demo.record.Message;

public class MessageDao {

	private ConnectionManager manager;
	
	public MessageDao(ConnectionManager manager) {
		super();
		this.manager = manager;
	}

	public int createMessage(Message data) {
		String sql = "insert into message(title,message) values('%s','%s')";
		
		try(var conn = manager.getConnection();
			var statement = conn.createStatement();) {
			
			return statement.executeUpdate(sql.formatted(data.title(),data.message()));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
		
	}
}
