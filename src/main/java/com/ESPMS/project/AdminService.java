package com.ESPMS.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {
    @Autowired
    private AdminRepo adminJpaRepository;

    public List<Admin> findAll() {
        return (List<Admin>) adminJpaRepository.findAll();
    }
    
    public Optional<Admin> findAdminByID(Long id) {
        return adminJpaRepository.findByID(id);
    }

    public Admin save(Admin admin) {
        // Perform additional processing if needed
        return adminJpaRepository.save(admin);
    }

    public void deleteById(Long id) {
    	adminJpaRepository.deleteById(id);
    }
}
