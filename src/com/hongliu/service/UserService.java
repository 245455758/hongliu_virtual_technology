package com.hongliu.service;

import com.hongliu.domain.User;

public interface UserService {
	/**
	 * 通过id和password 来进行登陆
	 * 若数据库中id和password符合，则返回user
	 * 否则返回null
	 * @param id
	 * @param password
	 * @return
	 */
	public User login(String studentId,String password);
	/**
	 * 通过传递一个user对象来进行注册
	 * @param user
	 */
	public void register(User user);

}
