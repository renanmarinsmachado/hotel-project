package br.com.logatti.project.hotel.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	
	private String description;
	
	@ManyToOne
	private RoomType roomType;
	
	private Double diaryValue;
	
	private Boolean available;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	
	public Double getDiaryValue() {
		return diaryValue;
	}

	public void setDiaryValue(Double diaryValue) {
		this.diaryValue = diaryValue;
	}
	
	public void setAvailable(Boolean available){
		this.available = available;
	}
	
	public Boolean isAvailable(){
		return available;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", description=" + description + ", roomType=" + roomType
				+ ", diaryValue=" + diaryValue + ", available=" + available + "]";
	}
}
