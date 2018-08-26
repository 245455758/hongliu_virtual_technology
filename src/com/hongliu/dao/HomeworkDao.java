package com.hongliu.dao;

import java.util.List;

import com.hongliu.domain.Exercise;
import com.hongliu.domain.Homework;

public interface HomeworkDao {
	/**
	 * 查找所有的Homework对象，并封装到List中返回
	 * @return
	 */
	public List<Homework> findAllHomeworks();
	/**
	 * 通过传递的Homework的id来查找对应的Exercise
	 * @param id
	 * @return
	 */
	public Homework findHomeworkById(Integer id);

}
