package com.hongliu.service.impl;

import java.util.List;

import com.hongliu.dao.NoticeDao;
import com.hongliu.domain.Notice;
import com.hongliu.service.NoticeService;

public class NoticeServiceImpl implements NoticeService {

	private NoticeDao noticeDao;
	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}
	
	@Override
	public List<Notice> findAllNotices() {
		return noticeDao.findAllNotices();
	}

	@Override
	public Notice findNoticeById(Integer id) {
		return noticeDao.findNoticeById(id);
	}

}
