package com.hongliu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hongliu.dao.HomeworkDao;
import com.hongliu.domain.Homework;

public class HomeworkDaoImpl implements HomeworkDao{

	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public List<Homework> findAllHomeworks() {
		return (List<Homework>) hibernateTemplate.find("from Homework");
	}

	@Override
	public Homework findHomeworkById(Integer id) {
		return (Homework) hibernateTemplate.find("from Homework h where h.id=?",id).get(0);
	}

}
