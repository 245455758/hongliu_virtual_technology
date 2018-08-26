package com.hongliu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hongliu.dao.ExerciseDao;
import com.hongliu.domain.Exercise;

public class ExerciseDaoImpl implements ExerciseDao {

	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public List<Exercise> findAllExercises() {
		return (List<Exercise>) hibernateTemplate.find("from Exercise");
	}

	@Override
	public Exercise findExerciseById(Integer id) {
		return (Exercise) hibernateTemplate.find("from Exercise e where e.id=?",id);
	}

}
