package com.hongliu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hongliu.dao.ReplyDao;
import com.hongliu.domain.Reply;

public class ReplyDaoImpl implements ReplyDao{

	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public List<Reply> findAllReplys() {
		return (List<Reply>) hibernateTemplate.find("from Reply");
	}

	@Override
	public Reply findReplyById(Integer id) {
		return (Reply) hibernateTemplate.find("from Reply h where h.id=?",id).get(0);
	}

}
