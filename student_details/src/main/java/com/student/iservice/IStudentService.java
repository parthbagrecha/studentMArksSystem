package com.student.iservice;

import com.student.model.StudentModel;

public interface IStudentService {
	
	public StudentModel getStudentById(Integer id) throws Exception;

}
