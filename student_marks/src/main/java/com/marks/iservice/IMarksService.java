package com.marks.iservice;

import com.marks.entity.MarksEntity;

public interface IMarksService {
	
	public MarksEntity getMarksByStudentId(Integer studentId);

}
