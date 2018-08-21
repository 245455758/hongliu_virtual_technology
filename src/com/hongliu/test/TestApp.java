package com.hongliu.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hongliu.domain.User;
import com.hongliu.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath*:applicationContext.xml")
public class TestApp {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void demo01(){
		User user = new User();
		user.setStudentId("1616270201");
		user.setUsername("jack");
		user.setPassword("1234");
		user.setTelephone("17693459940");
		user.setIsH(false);
		userService.register(user);
	}
}

