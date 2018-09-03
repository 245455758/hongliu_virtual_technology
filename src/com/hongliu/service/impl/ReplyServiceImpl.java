package com.hongliu.service.impl;

import java.util.List;

import com.hongliu.dao.ReplyDao;
import com.hongliu.domain.Reply;
import com.hongliu.service.ReplyService;

public class ReplyServiceImpl implements ReplyService {

	private ReplyDao ReplyDao;
	public void setReplyDao(ReplyDao ReplyDao) {
		this.ReplyDao = ReplyDao;
	}
	
	@Override
	public List<Reply> findAllReplys() {
		return ReplyDao.findAllReplys();
	}

	@Override
	public Reply findReplyById(Integer id) {
		return ReplyDao.findReplyById(id);
	}

}
