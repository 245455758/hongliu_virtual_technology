package com.hongliu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hongliu.dao.UserDao;
import com.hongliu.domain.User;

public class UserDaoImpl implements UserDao{

	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public void save(User user) {
		this.hibernateTemplate.save(user);
	}

	@Override
	public List findUserByIdAndPassword(String id, String password) {
		List<User> find = (List<User>) this.hibernateTemplate.find("from User u where u.studentId = ? and u.password = ?",id,password);
		return find;
	}
	
	

}
