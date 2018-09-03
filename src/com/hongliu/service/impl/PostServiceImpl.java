package com.hongliu.service.impl;

import java.util.List;

import com.hongliu.dao.PostDao;
import com.hongliu.domain.Post;
import com.hongliu.service.PostService;

public class PostServiceImpl implements PostService {

	private PostDao PostDao;
	public void setPostDao(PostDao PostDao) {
		this.PostDao = PostDao;
	}
	
	@Override
	public List<Post> findAllPosts() {
		return PostDao.findAllPosts();
	}

	@Override
	public Post findPostById(Integer id) {
		return PostDao.findPostById(id);
	}

}
