package br.com.logatti.project.hotel.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.logatti.project.hotel.entity.Room;
import br.com.logatti.project.hotel.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomEndpoint {

	@Autowired
	private RoomService roomService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public List<Room> findAll() {
        return (List<Room>) roomService.findAll();
    }
}
