package com.hongliu.service;

import java.util.List;

import com.hongliu.domain.Post;

public interface PostService {
	/**
	 * 查找并返回所有的Post对象
	 * @return
	 */
	public List<Post> findAllPosts();
	/**
	 * 通过id查找对应的Post对象
	 * @param id
	 * @return
	 */
	public Post findPostById(Integer id);
}
