package com.marks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marks.entity.MarksEntity;
import com.marks.iservice.IMarksService;

@RestController
@RequestMapping("/marks")
public class MarksController {
	
	@Autowired
	IMarksService marksService;
	
	@RequestMapping(value = "/getStudentMarks/{studentId}", method = RequestMethod.GET)
	public MarksEntity getMarksByStudentId(@PathVariable("studentId") Integer studentId) {
		try {
			return marksService.getMarksByStudentId(studentId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
			
		}
	}

}
