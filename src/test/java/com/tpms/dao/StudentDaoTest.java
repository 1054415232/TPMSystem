package com.tpms.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tpms.entity.Student;
@SuppressWarnings("all")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring_hibernate.xml"})
public class StudentDaoTest {
	@Autowired
	private StudentDao dao;
	
	@Test
	public void testAddStudent() {
		Student student=new Student("root");
		dao.addStudent(student);
	}

}
