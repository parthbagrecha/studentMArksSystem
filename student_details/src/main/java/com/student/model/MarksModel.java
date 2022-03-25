package com.student.model;

public class MarksModel {

	private Integer mathsMarks;
	private Integer englishMarks;
	private Integer scienceMarks;
	private Integer socialStudiesMarks;

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

	public MarksModel(Integer mathsMarks, Integer englishMarks, Integer scienceMarks, Integer socialStudiesMarks) {
		super();
		this.mathsMarks = mathsMarks;
		this.englishMarks = englishMarks;
		this.scienceMarks = scienceMarks;
		this.socialStudiesMarks = socialStudiesMarks;
	}

}
