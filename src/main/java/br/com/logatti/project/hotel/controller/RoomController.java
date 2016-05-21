package br.com.logatti.project.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.logatti.project.hotel.entity.Room;
import br.com.logatti.project.hotel.service.RoomService;

@Controller
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@RequestMapping(value="/room.html", method = RequestMethod.GET)
    public ModelAndView getList() {
        ModelMap model = new ModelMap();
        model.addAttribute("title", "Quartos");
        model.addAttribute("rooms", roomService.findAll());
        return new ModelAndView("room/index", model);
    }
	
	@RequestMapping(value="/room.html", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("room") Room room) {
		
		roomService.save(room);
		
        return getList();
    }
}
