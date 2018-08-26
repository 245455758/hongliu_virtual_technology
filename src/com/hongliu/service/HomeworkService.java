package com.hongliu.service;

import java.util.List;

import com.hongliu.domain.Homework;

public interface HomeworkService {
	/**
	 * 查找并返回所有的Homework对象
	 * @return
	 */
	public List<Homework> findAllHomeworks();
	/**
	 * 通过id查找对应的Exercise对象
	 * @param id
	 * @return
	 */
	public Homework findHomeworkById(Integer id);

}
