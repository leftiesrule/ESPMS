package com.ESPMS.project;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentDBManager extends JpaRepository<Student, Long>{
    List<Student> findAll();

    Optional<Student> findById(Long id);

    Student save(Student student);

    void deleteById(Long id);
}
