package com.hongliu.domain;

public class User {
	
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
	@Override
	public String toString() {
		return "User [id=" + id + ", studentId=" + studentId + ", username=" + username + ", password=" + password
				+ ", telephone=" + telephone + ", isH=" + isH + "]";
	}
	

}
