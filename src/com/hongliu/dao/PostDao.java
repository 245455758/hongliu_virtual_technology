package com.hongliu.dao;

import java.util.List;

import com.hongliu.domain.Post;

public interface PostDao {
	/**
	 * 查找所有的Post对象，并封装到List中返回
	 * @return
	 */
	public List<Post> findAllPosts();
	/**
	 * 通过传递的Post的id来查找对应的Exercise
	 * @param id
	 * @return
	 */
	public Post findPostById(Integer id);

}
