package com.hongliu.domain;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

public class Homework implements Serializable{
	
	private Integer homework_id;
	private Date time;
	private String title;
	private String context;
	private String publisher;
	private String email;
	private File file;
	private String fileName;//上传文件名字
	private String filePath;//文件保存的路径
	private String ContentType;//上传文件类型
	
	
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
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
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getContentType() {
		return ContentType;
	}
	public void setContentType(String contentType) {
		ContentType = contentType;
	}
	
	
	
}
