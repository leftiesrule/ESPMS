package com.ESPMS.project;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ExamScheduleRepo extends CrudRepository<ExamSchedule, Long>{
	
	@Query("SELECT e FROM ExamSchedule e WHERE e.examID = ?1")
    Optional<ExamSchedule> findByID(Long id);
//    List<Student> findAll();
//
//    Optional<Student> findById(Long id);
//
//    Student save(Student student);
//
//    void deleteById(Long id);
}
