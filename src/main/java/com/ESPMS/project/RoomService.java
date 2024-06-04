package com.ESPMS.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    @Autowired
    private RoomRepo roomJpaRepository;

    public List<Rooms> findAll() {
        return (List<Rooms>) roomJpaRepository.findAll();
    }
    
    public Optional<Rooms> findAdminByID(Long id) {
        return roomJpaRepository.findByID(id);
    }

    public Rooms save(Rooms room) {
        // Perform additional processing if needed
        return roomJpaRepository.save(room);
    }

    public void deleteById(Long id) {
    	roomJpaRepository.deleteById(id);
    }
    
    public Rooms update(Long id, Long floor, String Block, Long numOfRows, Long numOfColumns) {
		Optional<Rooms> optionalRooms = roomJpaRepository.findById(id);

		if (optionalRooms.isPresent()) {
			Rooms room = optionalRooms.get();

			if (!room.getFloor().equals(floor)) {
				room.setFloor(floor);
			}
			
			if (!room.getBlock().equals(Block)) {
				room.setBlock(Block);
			}

			if (!room.getNumOfRows().equals(numOfRows)) {
				room.setNumOfRows(numOfRows);
			}

			if (!room.getNumOfColumns().equals(numOfColumns)) {
				room.setNumOfColumns(numOfColumns);
			}

			return roomJpaRepository.save(room);
		}

		else {
			throw new RuntimeException("Room not found with id " + floor);
		}
    }
}
