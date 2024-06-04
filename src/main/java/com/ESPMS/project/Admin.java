package com.ESPMS.project;

import jakarta.persistence.*;

@Entity
@Table(name = "Admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "AdminID")
    private Long adminID;
    
    @Column(name = "Name")
    private String Name;

	public Admin() {
		
	}
    
    public Admin(String Name) {
        this.Name = Name;
    }
    
	public Long getAdminID() {
		return adminID;
	}
	
	public void setAdminID(Long adminID) {
		this.adminID = adminID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
}
