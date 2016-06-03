package br.com.logatti.project.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.logatti.project.hotel.service.PeriodService;

@Controller
public class PeriodController {

	@Autowired
	private PeriodService periodService;
	
	@RequestMapping(value="/hotelperiod", method = RequestMethod.GET)
	public ModelAndView getList(){
		return new ModelAndView("hotelperiod/index", init());
	}
	
	@RequestMapping(value="/hotelperiod", method = RequestMethod.POST)
	public ModelAndView save(@RequestParam("clientSelect") Long idClient, @RequestParam("idRoom") Long idRoom){
		periodService.save(idClient, idRoom);
		return new ModelAndView("hotelperiod/index", init());
	}  
	
	private ModelMap init(){
		ModelMap model = new ModelMap();
        model.addAttribute("title", "Estádias");
        return model;
	}
}
