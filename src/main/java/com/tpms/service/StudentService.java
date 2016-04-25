package com.tpms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpms.dao.StudentDao;
import com.tpms.entity.Student;

@Service(value = "studentService")
public class StudentService {
	@Autowired
	private StudentDao dao;

	public void add(Student student) {
		dao.addStudent(student);
	}
}
