package com.tpms.action;

import org.springframework.beans.factory.annotation.Autowired;
import com.tpms.entity.Student;
import com.tpms.service.StudentService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("all")
public class HomeAction extends ActionSupport {
	@Autowired 
	private StudentService service;

	@Override
	public String execute() throws Exception {
		Student student = new Student("liuc");
		service.add(student);
		return SUCCESS;
	}
}
