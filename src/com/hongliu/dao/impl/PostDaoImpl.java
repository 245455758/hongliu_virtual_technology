package com.hongliu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hongliu.dao.PostDao;
import com.hongliu.domain.Post;

public class PostDaoImpl implements PostDao{

	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public List<Post> findAllPosts() {
		return (List<Post>) hibernateTemplate.find("from Post");
	}

	@Override
	public Post findPostById(Integer id) {
		return (Post) hibernateTemplate.find("from Post h where h.id=?",id).get(0);
	}

}
