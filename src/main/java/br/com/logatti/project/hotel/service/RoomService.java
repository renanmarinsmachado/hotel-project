package br.com.logatti.project.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.logatti.project.hotel.entity.Room;
import br.com.logatti.project.hotel.repository.RoomRepository;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;
	
	public Iterable<Room> findAll(){
		return roomRepository.findAll();
	}
	
	public Room findById(Long id){
		return roomRepository.findOne(id);
	}
	
	public void save(Room room){
		roomRepository.save(room);
	}
	
	public Room get(Long id){
		return roomRepository.findOne(id);
	}
	
	public void remove(Long id) {
		roomRepository.delete(id);
	}
	
	public List<Room> findByAvailable(Boolean available){
		return roomRepository.findByAvailable(available);
	}
}
