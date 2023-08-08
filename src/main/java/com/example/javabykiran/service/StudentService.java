package com.example.javabykiran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javabykiran.dao.StudentDao;
import com.example.javabykiran.entity.Student;

@Service
public class StudentService {
@Autowired
StudentDao dao;

	public boolean addStudent(Student std) {
	return 	dao.addStudent(std);
	}

}
