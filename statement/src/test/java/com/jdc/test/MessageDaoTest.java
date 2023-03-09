package com.jdc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.demo.connection.ConnectionManager;
import com.demo.record.Message;
import com.jdc.dao.MessageDao;

class MessageDaoTest {
	
	MessageDao dao;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@BeforeEach
	void setUp() throws Exception {
		dao = new MessageDao(ConnectionManager.getInstnace());
	}

	@Test
	void test() {
		Message message = new Message("Greeting", "Hello,JDC OneStop Bootcamper");
		var result = dao.createMessage(message);
		assertEquals(1, result);
	}

}
