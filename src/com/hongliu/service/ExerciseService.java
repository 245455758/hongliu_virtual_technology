package com.hongliu.service;

import java.util.List;

import com.hongliu.domain.Exercise;
import com.hongliu.domain.Notice;

public interface ExerciseService {
	/**
	 * 查找并返回所有的notice对象
	 * @return
	 */
	public List<Exercise> findAllExercises();
	/**
	 * 通过id查找对应的Exercise对象
	 * @param id
	 * @return
	 */
	public Exercise findExerciseById(Integer id);
}
