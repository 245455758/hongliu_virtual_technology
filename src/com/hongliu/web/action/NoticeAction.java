package com.hongliu.web.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.hongliu.domain.Exercise;
import com.hongliu.domain.Homework;
import com.hongliu.domain.Notice;
import com.hongliu.service.ExerciseService;
import com.hongliu.service.HomeworkService;
import com.hongliu.service.NoticeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import net.sf.json.JSONObject;

public class NoticeAction extends ActionSupport implements ModelDriven<Notice>{

	/*
	 * 用来返回ajax请求的属性
	 */
	Map<String,String> map;
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	private Notice notice = new Notice();
	@Override
	public Notice getModel() {
		return notice;
	}
	/*
	 *noticeService, exerciseService,homeworkService
	 *三个实体类对应的service
	 */
	private NoticeService noticeService;
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	private ExerciseService exerciseService;
	public void setExerciseService(ExerciseService exerciseService) {
		this.exerciseService = exerciseService;
	}
	private HomeworkService homeworkService;
	public void setHomeworkService(HomeworkService homeworkService) {
		this.homeworkService = homeworkService;
	}
	
	
	public String showAllNotices() {
		ActionContext context = ActionContext.getContext();
		List<Notice> listOfNotices = noticeService.findAllNotices();
		List<Exercise> listOfExercise = exerciseService.findAllExercises();
		List<Homework> listOfHomework = homeworkService.findAllHomeworks();
		
		context.getContext().getSession().put("notices", listOfNotices);
		context.getContext().getSession().put("exercises", listOfExercise);
		context.getContext().getSession().put("homeworks", listOfHomework);
		return "showAllNotice_Success";
	}
	
	
	public String NoticeAjax() {
		System.out.println("ajax请求来了啊啊啊");
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("id"));
		Notice notice = noticeService.findNoticeById(id);
//		System.out.println(notice);
		map = new HashMap<String,String>();
		map.put("time", notice.getTime().toString());
		map.put("publisher", notice.getPublisher());
		map.put("context", notice.getContext());
//		System.out.println(map);
		return SUCCESS;
	}
	public String ExerciseAjax() {
		System.out.println("ajax请求来了啊啊啊");
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("id"));
		Exercise exercise = exerciseService.findExerciseById(id);
//		System.out.println(notice);
		map = new HashMap<String,String>();
		map.put("time", exercise.getTime().toString());
		map.put("url", exercise.getUrl());
		map.put("context", exercise.getContext());
//		System.out.println(map);
		return SUCCESS;
	}
	public String HomeworkAjax() {
		HttpServletRequest request = ServletActionContext.getRequest();
		int id = Integer.parseInt(request.getParameter("id"));
		Homework homework = homeworkService.findHomeworkById(id);
//		System.out.println(notice);
		map = new HashMap<String,String>();
		map.put("time", homework.getTime().toString());
		map.put("publisher", homework.getPublisher());
		map.put("context", homework.getContext());
		map.put("email", homework.getEmail());
		map.put("file", homework.getFilePath());
//		System.out.println(map);
		return SUCCESS;
	}

}
