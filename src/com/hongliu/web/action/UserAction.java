package com.hongliu.web.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hongliu.domain.User;
import com.hongliu.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends ActionSupport implements ModelDriven<User>{

	private User user = new User();
	
	@Override
	public User getModel() {
		return user;
	}
	
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	/**
	 * action类中的注册方法
	 * @return
	 */
	public String register() {
		user.setIsH(Boolean.FALSE);
		userService.register(user);
		System.out.println(user);
		return "register_success";
	}
	
	public String login() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String studentId = request.getParameter("studentId");
		String password = request.getParameter("password");
		User user = userService.login(studentId, password);
		if(user!=null)
			return "login_success";
		else 
			return "login_failed";
	}

}
