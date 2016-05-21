package br.com.logatti.project.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.logatti.project.hotel.entity.RoomType;
import br.com.logatti.project.hotel.repository.RoomTypeRepository;

@Service
public class RoomTypeService {

	@Autowired
	private RoomTypeRepository roomTypeRepository;
	
	public Iterable<RoomType> findAll(){
		return roomTypeRepository.findAll();
	}
}
