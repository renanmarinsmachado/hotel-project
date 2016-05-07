package br.com.logatti.project.hotel.repository;

import br.com.logatti.project.hotel.entity.Room;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface RoomRepository extends CrudRepository<Room, Long>{

}
