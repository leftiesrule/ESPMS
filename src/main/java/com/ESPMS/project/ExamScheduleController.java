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
@RequestMapping("/examSchedule")

public class ExamScheduleController {
	@Autowired
	private ExamScheduleService examScheduleService;
	
	@RequestMapping("/")
	public String home() {
		return "This is Exam Schedule homepage";
	}
	
	@RequestMapping("/all")
	public List<ExamSchedule> getAllExamSchedules() {
		return examScheduleService.findAll();
	}
	
	@RequestMapping("/{id}")
	public Optional<ExamSchedule> getExamScheduleById(@PathVariable Long id) {
		return examScheduleService.findExamScheduleByID(id);
	}
	
	@RequestMapping("/add")
	public ExamSchedule addExamSchedule(ExamSchedule examSchedule) {
        return examScheduleService.save(examSchedule);
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteExamScheduleById(@PathVariable Long id) {
		examScheduleService.deleteById(id);
		return "Exam Schedule deleted with id: " + id;
	}
	
	@PutMapping("/update/{id}")
    public ExamSchedule updateExamSchedule(
            @PathVariable Long id,
            @RequestParam String examDate,
            @RequestParam String examTime,
            @RequestParam String subject) {
        return examScheduleService.update(id, examDate, examTime, subject);
    }

    @PostMapping("/update/{id}")
    public ExamSchedule updateExamSchedulePost(
            @PathVariable Long id,
            @RequestParam String examDate,
            @RequestParam String examTime,
            @RequestParam String subject) {
        return examScheduleService.update(id, examDate, examTime, subject);
    }
}
