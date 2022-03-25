package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.iservice.IStudentService;
import com.student.model.StudentModel;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	IStudentService studentService;

	@RequestMapping(value = "/getStudent/{id}", method = RequestMethod.GET)
	public StudentModel getStudentById(@PathVariable("id") Integer id) {
		try {
			return studentService.getStudentById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			
		}
	}

}
