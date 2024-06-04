package com.ESPMS.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvigilatorService {
    @Autowired
    private InvigilatorRepo invigilatorJpaRepository;

    public List<Invigilator> findAll() {
        return (List<Invigilator>) invigilatorJpaRepository.findAll();
    }
    
    public Optional<Invigilator> findInvigilatorByID(Long id) {
        return invigilatorJpaRepository.findByID(id);
    }

    public Invigilator save(Invigilator invigilator) {
        // Perform additional processing if needed
        return invigilatorJpaRepository.save(invigilator);
    }

    public void deleteById(Long id) {
    	invigilatorJpaRepository.deleteById(id);
    }

	public Invigilator update(Long id, String name, String department) {
		Optional<Invigilator> optionalInvigilator = invigilatorJpaRepository.findById(id);

		if (optionalInvigilator.isPresent()) {
			Invigilator invigilator = optionalInvigilator.get();

			if (!invigilator.getName().equals(name)) {
				invigilator.setName(name);
			}

			if (!invigilator.getDepartment().equals(department)) {
				invigilator.setDepartment(department);
			}

			return invigilatorJpaRepository.save(invigilator);
		}

		else {
			throw new RuntimeException("Invigilator not found with id " + id);
		}
	}
}
