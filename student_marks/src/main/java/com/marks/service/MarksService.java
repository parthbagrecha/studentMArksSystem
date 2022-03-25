package com.marks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marks.entity.MarksEntity;
import com.marks.iservice.IMarksService;
import com.marks.repository.MarksRepository;

@Service
public class MarksService implements IMarksService {
	
	@Autowired
	MarksRepository marksRepository;

	@Override
	public MarksEntity getMarksByStudentId(Integer studentId) {
		return marksRepository.getMarksByStudentId(studentId);
	}

}
