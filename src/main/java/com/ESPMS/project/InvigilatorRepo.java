package com.ESPMS.project;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface InvigilatorRepo extends CrudRepository<Invigilator, Long>{
	
	@Query("SELECT i FROM Invigilator i WHERE i.invigilatorID = ?1")
    Optional<Invigilator> findByID(Long id);
//    List<Student> findAll();
//
//    Optional<Student> findById(Long id);
//
//    Student save(Student student);
//
//    void deleteById(Long id);
}
