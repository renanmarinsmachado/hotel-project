package br.com.logatti.project.hotel.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.logatti.project.hotel.entity.RoomType;
import br.com.logatti.project.hotel.service.RoomTypeService;

@RestController
@RequestMapping("/ed/roomType")
public class RoomTypeEndpoint {

	@Autowired
	private RoomTypeService roomTypeService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public List<RoomType> findAll() {
        return (List<RoomType>) roomTypeService.findAll();
    }
}
