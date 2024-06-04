package com.ESPMS.project;

import jakarta.persistence.*;

@Entity
@Table(name = "Rooms")
public class Rooms {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "RoomID")
    private Long roomID;
    
    @Column(name = "Floor")
    private Long floor;
    
    @Column(name = "Block")
    private String Block;
    
    @Column(name = "numOfRows")
    private Long numOfRows;
    
    @Column(name = "numOfCols")
    private Long numOfColumns;
    
	public Rooms() {
		
	}
	
	public Rooms(Long floor, String Block, Long numOfRows, Long numOfColumns) {
		this.floor = floor;
		this.Block = Block;
		this.numOfRows = numOfRows;
		this.numOfColumns = numOfColumns;
	}
    
	public Long getRoomID() {
		return roomID;
	}
	
	public void setRoomID(Long roomID) {
		this.roomID = roomID;
	}
	
	public Long getFloor() {
		return floor;
	}
	
	public void setFloor(Long floor) {
		this.floor = floor;
	}
	
	public String getBlock() {
		return Block;
	}
	
	public void setBlock(String Block) {
		this.Block = Block;
	}
	
	public Long getNumOfRows() {
		return numOfRows;
	}
	
	public void setNumOfRows(Long numOfRows) {
		this.numOfRows = numOfRows;
	}
	
	public Long getNumOfColumns() {
		return numOfColumns;
	}
	
	public void setNumOfColumns(Long numOfColumns) {
		this.numOfColumns = numOfColumns;
	}
}
