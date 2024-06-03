package com.ESPMS.project;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepo extends CrudRepository<Students, Long>{
	
	@Query("SELECT s FROM Students s WHERE s.studentID = ?1")
    Optional<Students> findByID(Long id);
//    List<Student> findAll();
//
//    Optional<Student> findById(Long id);
//
//    Student save(Student student);
//
//    void deleteById(Long id);
}
