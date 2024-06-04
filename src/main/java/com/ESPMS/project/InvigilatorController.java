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
@RequestMapping("/invigilators")

public class InvigilatorController {
	@Autowired
	private InvigilatorService invigilatorService;
	
	@RequestMapping("/")
	public String home() {
		return "This is Invigilator homepage";
	}
	
	@RequestMapping("/all")
	public List<Invigilator> getAllInvigilators() {
		return invigilatorService.findAll();
	}
	
	@RequestMapping("/{id}")
	public Optional<Invigilator> getInvigilatorById(@PathVariable Long id) {
		return invigilatorService.findInvigilatorByID(id);
	}
	
	@RequestMapping("/add")
	public Invigilator addAdmin(Invigilator invigilator) {
		return invigilatorService.save(invigilator);
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteAdminById(@PathVariable Long id) {
		invigilatorService.deleteById(id);
		return "Invigilator deleted with id: " + id;
	}
	
	@PutMapping("/update/{id}")
	public Invigilator updateInvigilator(@PathVariable Long id, @RequestParam String name, @RequestParam String department) {
		return invigilatorService.update(id, name, department);
	}
	
	@PostMapping("/update/{id}")
	public Invigilator updateInvigilatorPost(@PathVariable Long id, @RequestParam String name, @RequestParam String department) {
		return invigilatorService.update(id, name, department);
	}
}
