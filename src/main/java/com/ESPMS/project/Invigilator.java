package com.ESPMS.project;

import jakarta.persistence.*;

@Entity
@Table(name = "Invigilator")
public class Invigilator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "InvigilatorID")
    private Long invigilatorID;
    
    @Column(name = "Name")
    private String Name;
    
    @Column(name = "Department")
    private String Department;

	public Invigilator() {
		
	}

	public Invigilator(String name, String department) {
		Name = name;
		Department = department;
	}
	
	public Long getInvigilatorID() {
		return invigilatorID;
	}
	
	public void setInvigilatorID(Long invigilatorID) {
		this.invigilatorID = invigilatorID;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getDepartment() {
		return Department;
	}
	
	public void setDepartment(String department) {
		Department = department;
	}
}
