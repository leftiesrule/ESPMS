package com.ESPMS.project;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;
    private String Name;
    private String Department;
    private int Semester;

	public Students() {
		
	}
    
    public Students(String StudentName, String Department, int Semester) {
        this.Name = StudentName;
        this.Department = Department;
        this.Semester = Semester;
    }

    public String getStudentName() {
        return Name;
    }

    public String getDepartment() {
        return Department;
    }

    public int getSemester() {
        return Semester;
    }

    public void setStudentName(String StudentName) {
        this.Name = StudentName;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }
}
