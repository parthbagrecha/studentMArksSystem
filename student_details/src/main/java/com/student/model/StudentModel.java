package com.student.model;

public class StudentModel {

	private Integer id;
	private String studentName;
	private String studentClass;
	private MarksModel marksModel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public MarksModel getMarksModel() {
		return marksModel;
	}

	public void setMarksModel(MarksModel marksModel) {
		this.marksModel = marksModel;
	}

	public StudentModel(Integer id, String studentName, String studentClass, MarksModel marksModel) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.marksModel = marksModel;
	}

}
