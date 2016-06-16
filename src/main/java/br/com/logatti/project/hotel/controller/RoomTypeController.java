package br.com.logatti.project.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.logatti.project.hotel.entity.RoomType;
import br.com.logatti.project.hotel.service.RoomTypeService;

@Controller
public class RoomTypeController {

	@Autowired
	private RoomTypeService roomTypeService;
	
	@RequestMapping(value="/roomtype", method = RequestMethod.GET)
    public ModelAndView getList() {
        return new ModelAndView("roomtype/index", init(0));
    }
	
	@RequestMapping(value="/roomtype", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("roomtype") RoomType roomtype) {
		
//		if(roomtype.getId() == null){
//			roomtype.setAvailable(true);
//		}
		
		roomTypeService.save(roomtype);
		
        return getList();
    }
	
	@RequestMapping(value="/roomTypeEdit", method = RequestMethod.POST)
    public ModelAndView getToEdit(@RequestParam("idEdit") Long id) {
		ModelMap model = init(1);
		model.addAttribute("roomtype", roomTypeService.get(id));
        return new ModelAndView("roomtype/index", model);		
    }
	
	@RequestMapping(value="/roomTypeRemove", method = RequestMethod.POST)
    public ModelAndView remove(@RequestParam("idRemove") Long id) {
		roomTypeService.remove(id);
        return getList();		
    }
	
	private ModelMap init(int openCreate){
		ModelMap model = new ModelMap();
        model.addAttribute("title", "Tipos de quartos");
        model.addAttribute("openCreate", openCreate);
        model.addAttribute("roomtypes", roomTypeService.findAll());
        return model;
	}
}
