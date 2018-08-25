package com.hongliu.domain;

import java.util.Date;

public class Exercise {
	
	private Integer exercise_id;
	private Date time;
	private String title;
	private String url;
	private String context;
	public Integer getExercise_id() {
		return exercise_id;
	}
	public void setExercise_id(Integer exercise_id) {
		this.exercise_id = exercise_id;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
	

}
