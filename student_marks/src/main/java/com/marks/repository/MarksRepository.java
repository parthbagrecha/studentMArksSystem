package com.marks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.marks.entity.MarksEntity;

@Repository
public interface MarksRepository extends JpaRepository<MarksEntity, Integer> {
	
	@Query(value="SELECT * FROM marks.student_marks where student_id = ?1", nativeQuery=true)
	public MarksEntity getMarksByStudentId(Integer studentId);

}
