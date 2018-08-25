package com.hongliu.service;

import java.util.List;

import com.hongliu.domain.Notice;

public interface NoticeService {
	/**
	 * 查找并返回所有的notice对象
	 * @return
	 */
	public List<Notice> findAllNotices();
	/**
	 * 通过id查找对应的notice对象
	 * @param id
	 * @return
	 */
	public Notice findNoticeById(Integer id);

}
