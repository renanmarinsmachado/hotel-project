package br.com.logatti.project.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping("/index.html")
    public ModelAndView getListUsersView() {
        ModelMap model = new ModelMap();
        model.addAttribute("title", "Hotel Logatti");
        return new ModelAndView("index", model);
    }

}
