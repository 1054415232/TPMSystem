package com.tpms.entity;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@SuppressWarnings("all")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring_hibernate.xml" })
public class StudentTest {
	@Autowired
	private SessionFactory factory;

	@Test
	public void test() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student student = new Student("liuc");
		session.save(student);

		transaction.commit();
		session.close();
	}

}
