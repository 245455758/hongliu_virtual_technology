package com.hongliu.web.action;

import java.util.List;

import com.hongliu.domain.Notice;
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
	
	public String showAllNotices() {
		ActionContext context = ActionContext.getContext();
		List<Notice> listOfNotices = noticeService.findAllNotices();
		context.getContext().getSession().put("notices", listOfNotices);
		return "showAllNotice_Success";
	}

}
