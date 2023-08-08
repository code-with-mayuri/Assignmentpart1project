package com.example.javabykiran.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.javabykiran.entity.Student;
@Repository
public class StudentDao {
	@Autowired
	SessionFactory sf;
	public boolean addStudent(Student std) {
		Session session=	sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(std);
		tr.commit();
		session.close();
		return true;
	}

}
