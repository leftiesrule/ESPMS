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
@RequestMapping("/rooms")

public class RoomController {
	@Autowired
	private RoomService roomService;
	
	@RequestMapping("/")
	public String home() {
		return "This is Rooms homepage";
	}
	
	@RequestMapping("/all")
	public List<Rooms> getAllRooms() {
		return roomService.findAll();
	}
	
	@RequestMapping("/{id}")
	public Optional<Rooms> getRoomsById(@PathVariable Long id) {
		return roomService.findAdminByID(id);
	}
	
	@RequestMapping("/add")
	public Rooms addRooms(Rooms room) {
		return roomService.save(room);
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteRoomsById(@PathVariable Long id) {
		roomService.deleteById(id);
		return "Rooms deleted with id: " + id;
	}
	
	@PutMapping("/update/{id}")
	public Rooms updateRooms(@PathVariable Long id, @RequestParam Long floor, @RequestParam String Block, @RequestParam Long numOfRows, @RequestParam Long numOfColumns) {
		return roomService.update(id, floor, Block, numOfRows, numOfColumns);
	}
	
	@PostMapping("/update/{id}")
	public Rooms updateRoomsPost(@PathVariable Long id, @RequestParam Long floor, @RequestParam String Block, @RequestParam Long numOfRows, @RequestParam Long numOfColumns) {
		return roomService.update(id, floor, Block, numOfRows, numOfColumns);
	}
}
