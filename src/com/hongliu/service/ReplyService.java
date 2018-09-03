package com.hongliu.service;

import java.util.List;

import com.hongliu.domain.Reply;

public interface ReplyService {
	/**
	 * 查找并返回所有的Reply对象
	 * @return
	 */
	public List<Reply> findAllReplys();
	/**
	 * 通过id查找对应的Reply对象
	 * @param id
	 * @return
	 */
	public Reply findReplyById(Integer id);
}
