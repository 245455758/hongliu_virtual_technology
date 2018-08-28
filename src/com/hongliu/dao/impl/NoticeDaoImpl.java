package com.hongliu.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.hongliu.dao.NoticeDao;
import com.hongliu.domain.Notice;

public class NoticeDaoImpl implements NoticeDao {

	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public List<Notice> findAllNotices() {
		return (List<Notice>) hibernateTemplate.find("from Notice");
	}

	@Override
	public Notice findNoticeById(Integer id) {
		return (Notice) hibernateTemplate.find("from Notice n where n.id=?",id).get(0);
	}

}
