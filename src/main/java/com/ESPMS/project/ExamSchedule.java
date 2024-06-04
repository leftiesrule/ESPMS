package com.ESPMS.project;

import java.util.Random;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;

@Entity
@Table(name = "ExamSchedule")
public class ExamSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "ExamID")
    private Long examID;
    
    @Column(name = "ExamDate")
    private String examDate;
    
    @Column(name = "ExamTime")
    private String examTime;
    
    @Column(name = "Subject")
    private String subject;

	public ExamSchedule() {
		Random rand = new Random();

        int day = rand.nextInt(31) + 1;
        int month = rand.nextInt(12) + 1;
        int hour = rand.nextInt(24);
        int minute = rand.nextInt(60);

        examDate = String.format("%02d/%02d/2024", day, month);
        examTime = String.format("%02d:%02d", hour, minute);
        subject = "Maths";
	}
	
	public ExamSchedule(String examDate, String examTime, String subject) {
		this.examDate = examDate;
		this.examTime = examTime;
		this.subject = subject;
	}
	
	public Long getExamID() {
		return examID;
	}
	
	public void setExamID(Long examID) {
		this.examID = examID;
	}

	public String getExamDate() {
		return examDate;
	}

	public String getExamTime() {
		return examTime;
	}

	public String getSubject() {
		return subject;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}

	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
