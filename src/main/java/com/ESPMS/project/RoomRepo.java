package com.ESPMS.project;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoomRepo extends CrudRepository<Rooms, Long>{
	
	@Query("SELECT r FROM Rooms r WHERE r.roomID = ?1")
    Optional<Rooms> findByID(Long id);
//    List<Student> findAll();
//
//    Optional<Student> findById(Long id);
//
//    Student save(Student student);
//
//    void deleteById(Long id);
}
