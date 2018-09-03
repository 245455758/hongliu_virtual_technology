package com.hongliu.dao;

import java.util.List;

import com.hongliu.domain.Reply;

public interface ReplyDao {
	/**
	 * 查找所有的Reply对象，并封装到List中返回
	 * @return
	 */
	public List<Reply> findAllReplys();
	/**
	 * 通过传递的Reply的id来查找对应的Reply
	 * @param id
	 * @return
	 */
	public Reply findReplyById(Integer id);
	
}
