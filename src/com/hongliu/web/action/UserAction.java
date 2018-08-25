package com.hongliu.web.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hongliu.domain.User;
import com.hongliu.service.UserService;
import com.opensymphony.xwork2.ActionContext;
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
		ActionContext context = ActionContext.getContext();
		try {
			userService.register(user);
		} catch (Exception e) {
			context.getContext().getSession().put("register_failed", e.getMessage());
			return "register_failed";
		}
		
		context.getContext().getSession().put("user", user);
		return "register_success";
	}
	/**
	 * userAction类中的登陆方法
	 * @return
	 */
	public String login() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String studentId = request.getParameter("studentId");
		String password = request.getParameter("password");
		User user = userService.login(studentId, password);
		ActionContext context = ActionContext.getContext();
		if(user!=null) {
			context.getContext().getSession().put("user", user);
			return "login_success";
		}
		else {
			context.getContext().getSession().put("login_failed", "学号或密码错误");
			return "login_failed";
		}
	}

}
