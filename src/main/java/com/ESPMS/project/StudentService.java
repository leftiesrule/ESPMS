package com.ESPMS.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentJpaRepository;

    public List<Students> findAll() {
        return (List<Students>) studentJpaRepository.findAll();
    }

    public Optional<Students> findStudentByID(Long id) {
        return studentJpaRepository.findByID(id);
    }

    public Students save(Students student) {
        // Perform additional processing if needed
        return studentJpaRepository.save(student);
    }

    public void deleteById(Long id) {
        studentJpaRepository.deleteById(id);
    }
    
	public Students update(Long id, String name, String department, Long Semester) {
		Optional<Students> optionalStudents = studentJpaRepository.findById(id);
		
		if (optionalStudents.isPresent()) {
			Students student = optionalStudents.get();

			if (!student.getStudentName().equals(name)) {
				student.setStudentName(name);
			}

			if (!student.getDepartment().equals(department)) {
				student.setDepartment(department);
			}

			if (!student.getSemester().equals(Semester)) {
				student.setSemester(Semester);
			}

			return studentJpaRepository.save(student);
		}

		else {
			throw new RuntimeException("Student not found with id " + id);
		}
		
	}
}
