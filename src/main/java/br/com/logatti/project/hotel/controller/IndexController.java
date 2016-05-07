package br.com.logatti.project.hotel.controller;

import br.com.logatti.project.hotel.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@Autowired
	private RoomRepository roomRepository;
	
	@RequestMapping("/index")
    public ModelAndView getListUsersView() {
        ModelMap model = new ModelMap();
        model.addAttribute("message", "Hello");
        model.addAttribute("rooms", roomRepository.findAll());
        return new ModelAndView("index", model);
    }

}
