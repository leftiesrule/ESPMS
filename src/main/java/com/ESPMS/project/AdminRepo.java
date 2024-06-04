package com.ESPMS.project;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdminRepo extends CrudRepository<Admin, Long>{
	
	@Query("SELECT s FROM Admin s WHERE s.adminID = ?1")
    Optional<Admin> findByID(Long id);
//    List<Student> findAll();
//
//    Optional<Student> findById(Long id);
//
//    Student save(Student student);
//
//    void deleteById(Long id);
}
