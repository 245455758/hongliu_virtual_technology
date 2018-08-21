package com.hongliu.service.impl;

import java.util.List;

import com.hongliu.dao.UserDao;
import com.hongliu.domain.User;
import com.hongliu.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public User login(String id, String password) {
		List list = userDao.findUserByIdAndPassword(id, password);
		if(list.size()==0) return null;
		else return (User) list.get(0);
				
	
	}

	@Override
	public void register(User user) {
		userDao.save(user);
	}

}
