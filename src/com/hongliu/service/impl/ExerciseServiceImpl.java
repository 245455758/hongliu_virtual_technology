package com.hongliu.service.impl;

import java.util.List;

import com.hongliu.dao.ExerciseDao;
import com.hongliu.domain.Exercise;
import com.hongliu.service.ExerciseService;

public class ExerciseServiceImpl implements ExerciseService {

	private ExerciseDao exerciseDao;
	public void setExerciseDao(ExerciseDao exerciseDao) {
		this.exerciseDao = exerciseDao;
	}
	
	@Override
	public List<Exercise> findAllExercises() {
		return exerciseDao.findAllExercises();
	}

	@Override
	public Exercise findExerciseById(Integer id) {
		return exerciseDao.findExerciseById(id);
	}

}
