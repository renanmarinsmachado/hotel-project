package br.com.logatti.project.hotel.service;

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
	
	public void save(Room room){
		roomRepository.save(room);
	}
	
	public Room get(Long id){
		return roomRepository.findOne(id);
	}
	
	public void remove(Long id) {
		roomRepository.delete(id);
	}
}
