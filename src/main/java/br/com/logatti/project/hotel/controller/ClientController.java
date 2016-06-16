package br.com.logatti.project.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.logatti.project.hotel.entity.Client;
import br.com.logatti.project.hotel.service.ClientService;

@Controller
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value="/client", method = RequestMethod.GET)
    public ModelAndView getList() {
        return new ModelAndView("client/index", init(0));
    }
	
	@RequestMapping(value="/client", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("client") Client client) {
		
		clientService.save(client);
		
        return getList();
    }
	
	@RequestMapping(value="/clientEdit", method = RequestMethod.POST)
    public ModelAndView getToEdit(@RequestParam("idEdit") Long id) {
		ModelMap model = init(1);
		model.addAttribute("client", clientService.get(id));
        return new ModelAndView("client/index", model);		
    }
	
	@RequestMapping(value="/clientRemove", method = RequestMethod.POST)
    public ModelAndView remove(@RequestParam("idRemove") Long id) {
		clientService.remove(id);
        return getList();		
    }
	
	private ModelMap init(int openCreate){
		ModelMap model = new ModelMap();
        model.addAttribute("title", "Clientes");
        model.addAttribute("openCreate", openCreate);
        model.addAttribute("clients", clientService.findAll());
        return model;
	}
}
