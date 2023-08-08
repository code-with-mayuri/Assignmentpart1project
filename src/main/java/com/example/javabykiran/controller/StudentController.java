package com.example.javabykiran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.javabykiran.entity.Student;
import com.example.javabykiran.service.StudentService;

@RestController
public class StudentController {
@Autowired
StudentService ser;
@PostMapping("/student")
public boolean addStudent(@RequestBody Student std)
{
return ser.addStudent(std);	
}

}
