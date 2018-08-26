package com.hongliu.service.impl;

import java.util.List;

import com.hongliu.dao.HomeworkDao;
import com.hongliu.domain.Homework;
import com.hongliu.service.HomeworkService;

public class HomeworkServiceImpl implements HomeworkService {
	
	private HomeworkDao homeworkDao;
	public void setHomeworkDao(HomeworkDao homeworkDao) {
		this.homeworkDao = homeworkDao;
	}

	@Override
	public List<Homework> findAllHomeworks() {
		return homeworkDao.findAllHomeworks();
	}

	@Override
	public Homework findHomeworkById(Integer id) {
		return homeworkDao.findHomeworkById(id);
	}

}
