package com.ESPMS.project;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "StudentID")
    private Long studentID;
    
    @Column(name = "Name")
    private String Name;
    
    @Column(name = "Department")
    private String Department;
    
    @Column(name = "Semester")
    private Long Semester;

	public Students() {
		
	}
    
    public Students(String StudentName, String Department, Long Semester) {
        this.Name = StudentName;
        this.Department = Department;
        this.Semester = Semester;
    }
    
	public Long getStudentID() {
		return studentID;
	}
	
	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}

    public String getStudentName() {
        return Name;
    }

    public String getDepartment() {
        return Department;
    }

    public Long getSemester() {
        return Semester;
    }

    public void setStudentName(String StudentName) {
        this.Name = StudentName;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public void setSemester(Long Semester) {
        this.Semester = Semester;
    }
}
