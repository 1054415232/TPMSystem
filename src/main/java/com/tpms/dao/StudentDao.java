package com.tpms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tpms.entity.Student;

@Repository(value = "studentDao")
public class StudentDao {
	@Autowired
	private SessionFactory factory;

	public void addStudent(Student student) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(student);
		transaction.commit();
		session.close();
	}
}
