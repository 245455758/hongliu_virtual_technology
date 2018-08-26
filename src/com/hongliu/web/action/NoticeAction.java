package com.hongliu.web.action;

import java.util.List;

import com.hongliu.domain.Exercise;
import com.hongliu.domain.Homework;
import com.hongliu.domain.Notice;
import com.hongliu.service.ExerciseService;
import com.hongliu.service.HomeworkService;
import com.hongliu.service.NoticeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class NoticeAction extends ActionSupport implements ModelDriven<Notice>{

	private Notice notice = new Notice();
	@Override
	public Notice getModel() {
		return notice;
	}
	
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
//		HttpServletRequest request = ServletActionContext.getRequest();
//		request.setAttribute("notices", listOfNotices);
		return "showAllNotice_Success";
	}

}
