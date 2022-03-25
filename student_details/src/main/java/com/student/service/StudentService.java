package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.student.entity.MarksEntity;
import com.student.entity.StudentEntity;
import com.student.iservice.IStudentService;
import com.student.model.MarksModel;
import com.student.model.StudentModel;
import com.student.repository.StudentRepository;

@Service
public class StudentService implements IStudentService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	RestTemplate restTemplate;

	private String marksUrl = "http://localhost:9002/marks/getStudentMarks/";

	@Override
	public StudentModel getStudentById(Integer id) throws Exception {
		StudentEntity studentEntity = studentRepository.getStudentById(id);
		MarksEntity marksEntity = restTemplate.getForObject(marksUrl + id, MarksEntity.class);
		MarksModel marksModel = new MarksModel(marksEntity.getMathsMarks(), marksEntity.getEnglishMarks(),
				marksEntity.getScienceMarks(), marksEntity.getSocialStudiesMarks());
		StudentModel studentModel = new StudentModel(studentEntity.getId(), studentEntity.getStudentName(),
				studentEntity.getStudentClass(), marksModel);
		return studentModel;
	}

}
