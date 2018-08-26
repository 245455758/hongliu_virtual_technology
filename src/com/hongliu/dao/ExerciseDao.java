package com.hongliu.dao;

import java.util.List;

import com.hongliu.domain.Exercise;
import com.hongliu.domain.Notice;

public interface ExerciseDao {
	/**
	 * 查找所有的Exercise对象，并封装到List中返回
	 * @return
	 */
	public List<Exercise> findAllExercises();
	/**
	 * 通过传递的Exercise的id来查找对应的Exercise
	 * @param id
	 * @return
	 */
	public Exercise findExerciseById(Integer id);

}
