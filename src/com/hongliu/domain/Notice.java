package com.hongliu.domain;

import java.util.Date;

public class Notice {
	
	private Integer notice_id;
	private Date time;
	private String title;
	private String context;
	private String publisher;
	
	public Integer getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(Integer notice_id) {
		this.notice_id = notice_id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	

}
