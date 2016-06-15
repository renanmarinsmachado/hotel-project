package br.com.logatti.project.hotel.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import br.com.logatti.project.hotel.entity.Room;

@Transactional
public interface RoomRepository extends CrudRepository<Room, Long>{

	public List<Room> findByAvailable(Boolean available);
}
