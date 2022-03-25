package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.student.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	
	@Query(value="SELECT * FROM student.student_details where student_id = ?1", nativeQuery=true)
	public StudentEntity getStudentById(Integer id);

}
