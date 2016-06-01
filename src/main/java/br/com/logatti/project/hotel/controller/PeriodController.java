package br.com.logatti.project.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PeriodController {

	@RequestMapping(value="/hotelperiod")
	public ModelAndView getList(){
		return new ModelAndView("hotelperiod/index", init());
	}
	
	private ModelMap init(){
		ModelMap model = new ModelMap();
        model.addAttribute("title", "Estádias");
        return model;
	}
}
