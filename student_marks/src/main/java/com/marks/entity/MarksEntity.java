package com.marks.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_marks")
public class MarksEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "student_id")
	private Integer studentId;

	@Column(name = "maths_marks")
	private Integer mathsMarks;

	@Column(name = "english_marks")
	private Integer englishMarks;

	@Column(name = "science_marks")
	private Integer scienceMarks;

	@Column(name = "social_studies_marks")
	private Integer socialStudiesMarks;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(Integer mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public Integer getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(Integer englishMarks) {
		this.englishMarks = englishMarks;
	}

	public Integer getScienceMarks() {
		return scienceMarks;
	}

	public void setScienceMarks(Integer scienceMarks) {
		this.scienceMarks = scienceMarks;
	}

	public Integer getSocialStudiesMarks() {
		return socialStudiesMarks;
	}

	public void setSocialStudiesMarks(Integer socialStudiesMarks) {
		this.socialStudiesMarks = socialStudiesMarks;
	}

	public MarksEntity(Integer studentId, Integer mathsMarks, Integer englishMarks, Integer scienceMarks,
			Integer socialStudiesMarks) {
		super();
		this.studentId = studentId;
		this.mathsMarks = mathsMarks;
		this.englishMarks = englishMarks;
		this.scienceMarks = scienceMarks;
		this.socialStudiesMarks = socialStudiesMarks;
	}

	public MarksEntity() {
		super();
	}

}
