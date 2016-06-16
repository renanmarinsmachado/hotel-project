package br.com.logatti.project.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.logatti.project.hotel.entity.Room;
import br.com.logatti.project.hotel.service.RoomService;

@Controller
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@RequestMapping(value="/room", method = RequestMethod.GET)
    public ModelAndView getList() {
        return new ModelAndView("room/index", init(0));
    }
	
	@RequestMapping(value="/room", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("room") Room room) {
		
		if(room.getId() == null){
			room.setAvailable(true);
		}
		
		roomService.save(room);
		
        return getList();
    }
	
	@RequestMapping(value="/roomEdit", method = RequestMethod.POST)
    public ModelAndView getToEdit(@RequestParam("idEdit") Long id) {
		ModelMap model = init(1);
		model.addAttribute("room", roomService.get(id));
        return new ModelAndView("room/index", model);		
    }
	
	@RequestMapping(value="/roomRemove", method = RequestMethod.POST)
    public ModelAndView remove(@RequestParam("idRemove") Long id) {
		roomService.remove(id);
        return getList();		
    }
	
	private ModelMap init(int openCreate){
		ModelMap model = new ModelMap();
		model.addAttribute("room", new Room());
        model.addAttribute("title", "Quartos");
        model.addAttribute("openCreate", openCreate);
        model.addAttribute("rooms", roomService.findAll());
        return model;
	}
}
