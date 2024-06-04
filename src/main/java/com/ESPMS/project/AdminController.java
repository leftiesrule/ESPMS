package com.ESPMS.project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admins")

public class AdminController {
	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/")
	public String home() {
		return "This is Admin homepage";
	}
	
	@RequestMapping("/all")
	public List<Admin> getAllAdmins() {
		return adminService.findAll();
	}
	
	@RequestMapping("/{id}")
	public Optional<Admin> getAdminById(@PathVariable Long id) {
		return adminService.findAdminByID(id);
	}
	
	@RequestMapping("/add")
	public Admin addAdmin(Admin admin) {
		return adminService.save(admin);
	}
	
	@RequestMapping("/delete/{id}")
	public void deleteAdminById(@PathVariable Long id) {
		adminService.deleteById(id);
	}
}
