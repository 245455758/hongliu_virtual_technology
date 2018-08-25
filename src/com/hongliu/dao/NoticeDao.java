package com.hongliu.dao;

import java.util.List;

import com.hongliu.domain.Notice;

public interface NoticeDao {
	/**
	 * 查找所有的Notice对象，并封装到List中返回
	 * @return
	 */
	public List<Notice> findAllNotices();
	/**
	 * 通过传递的notice的id来查找对应的notice
	 * @param id
	 * @return
	 */
	public Notice findNoticeById(Integer id);
	
}
