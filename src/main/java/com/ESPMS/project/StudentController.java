package com.ESPMS.project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")

public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String home() {
		return "This is Student homepage";
	}
	
	@RequestMapping("/all")
	public List<Students> getAllStudents() {
		return studentService.findAll();
	}
	
	@RequestMapping("/{id}")
	public Optional<Students> getStudentById(@PathVariable Long id) {
		return studentService.findStudentByID(id);
	}
	
	@RequestMapping("/add")
	public Students addStudent(Students student) {
		return studentService.save(student);
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteStudentById(@PathVariable Long id) {
		studentService.deleteById(id);
		return "Student deleted with id: " + id;
	}
	
	@PutMapping("/update/{id}")
	public Students updateStudent(@PathVariable Long id, @RequestParam String name, @RequestParam String department, @RequestParam Long Semester) {
		return studentService.update(id, name, department, Semester);
	}
	
	@PostMapping("/update/{id}")
	public Students updateStudentPost(@PathVariable Long id, @RequestParam String name, @RequestParam String department, @RequestParam Long Semester) {
		return studentService.update(id, name, department, Semester);
	}
}
