package com.ESPMS.project;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String StudentName;
    private String Department;
    private int Semester;

    public Student(String StudentName, String Department, int Semester) {
        this.StudentName = StudentName;
        this.Department = Department;
        this.Semester = Semester;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getDepartment() {
        return Department;
    }

    public int getSemester() {
        return Semester;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }
}
