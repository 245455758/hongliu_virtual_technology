package com.hongliu.domain;

import java.io.Serializable;
import java.util.Set;

public class User implements Serializable{
	
/*	CREATE TABLE t_user(
			id VARCHAR(30) PRIMARY KEY,
			username VARCHAR(50),
			PASSWORD VARCHAR(50),
			telephone VARCHAR(50),
			isH BOOLEAN
		);*/
	private Integer id;
	private String studentId;
	private String username;
	private String password;
	private String telephone;
	private Boolean isH;

	private Set<Post> posts;
	private Set<Reply> replies;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Boolean getIsH() {
		return isH;
	}
	public void setIsH(Boolean isH) {
		this.isH = isH;
	}
	public Set<Post> getPosts() {
		return posts;
	}
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}
	public Set<Reply> getReplies() {
		return replies;
	}
	public void setReplies(Set<Reply> replies) {
		this.replies = replies;
	}
	

}
