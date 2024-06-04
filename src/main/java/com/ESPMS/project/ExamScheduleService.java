package com.ESPMS.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ExamScheduleService {
    @Autowired
    private ExamScheduleRepo examExcheduleJpaRepository;
    
    public List<ExamSchedule> findAll() {
        return (List<ExamSchedule>) examExcheduleJpaRepository.findAll();
    }

    public Optional<ExamSchedule> findExamScheduleByID(Long id) {
        return examExcheduleJpaRepository.findByID(id);
    }

    public ExamSchedule save(ExamSchedule examSchedule) {
        // Perform additional processing if needed
        return examExcheduleJpaRepository.save(examSchedule);
    }

    public void deleteById(Long id) {
    	examExcheduleJpaRepository.deleteById(id);
    }
    
    @Transactional
    public ExamSchedule update(Long id, String examDate, String examTime, String subject) {
        Optional<ExamSchedule> optionalExamSchedule = examExcheduleJpaRepository.findById(id);

        if (optionalExamSchedule.isPresent()) {
            ExamSchedule examSchedule = optionalExamSchedule.get();
            
            if (!examSchedule.getExamDate().equals(examDate)) {
                examSchedule.setExamDate(examDate);
            }
            
            if (!examSchedule.getExamTime().equals(examTime)) {
                examSchedule.setExamTime(examTime);
            }
            
            if (!examSchedule.getSubject().equals(subject)) {
                examSchedule.setSubject(subject);
            }
            
            return examExcheduleJpaRepository.save(examSchedule);
        } 
        
        else {
            throw new RuntimeException("Exam Schedule not found with id " + id);
        }
    }
}
