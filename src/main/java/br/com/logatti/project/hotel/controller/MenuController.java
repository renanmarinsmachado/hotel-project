package br.com.logatti.project.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.logatti.project.hotel.entity.Menu;
import br.com.logatti.project.hotel.service.MenuService;

@Controller
public class MenuController {

	@Autowired
	private MenuService menuService;
	
	@RequestMapping(value="/menu", method = RequestMethod.GET)
    public ModelAndView getList() {
        return new ModelAndView("cardapio/index", init(0));
    }
	
	@RequestMapping(value="/menu", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("menu") Menu menu) {
		menuService.save(menu);
		
        return getList();
    }
	
	@RequestMapping(value="/menuEdit", method = RequestMethod.POST)
    public ModelAndView getToEdit(@RequestParam("idEdit") Long id) {
		ModelMap model = init(1);
		model.addAttribute("menu", menuService.get(id));
        return new ModelAndView("cardapio/index", model);		
    }
	
	@RequestMapping(value="/menuRemove", method = RequestMethod.POST)
    public ModelAndView remove(@RequestParam("idRemove") Long id) {
		menuService.remove(id);
        return getList();		
    }
	
	private ModelMap init(int openCreate){
		ModelMap model = new ModelMap();
        model.addAttribute("title", "Cardápio");
        model.addAttribute("openCreate", openCreate);
        model.addAttribute("menus", menuService.findAll());
        return model;
	}
}