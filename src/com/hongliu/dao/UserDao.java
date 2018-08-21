package com.hongliu.dao;

import java.util.List;

import com.hongliu.domain.User;

public interface UserDao {
	/**
	 * 将user对象保存到数据库
	 * @param user
	 */
	public void save(User user);
	/**
	 * 通过id和password 来查找User对象
	 * @param id
	 * @param password
	 * @return
	 */
	public List findUserByIdAndPassword(String id,String password);

}
