package com.scarecrow.elearning.uac.dao;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scarecrow.elearning.uac.entity.User;

class UserDaoTest {

	private ApplicationContext ac = null;
	
	@BeforeEach
	void setUp() throws Exception {
		ac = new ClassPathXmlApplicationContext("classpath:*/config/spring-context.xml");
	}

	@Test
	void testGetAll() {
		UserDao userDao = (UserDao) ac.getBean("userDao");
		List<User> users = userDao.getAll();
		System.out.println(users);
	}

}
