package com.hongliu.domain;

import java.io.File;
import java.util.Date;

public class Homework {
	
	private Integer homework_id;
	private Date time;
	private String title;
	private String context;
	private String publisher;
	private String email;
	private File file;
	
	
	public Integer getHomework_id() {
		return homework_id;
	}
	public void setHomework_id(Integer homework_id) {
		this.homework_id = homework_id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	
	
	
}
