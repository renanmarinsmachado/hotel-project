package br.com.logatti.project.hotel.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.logatti.project.hotel.service.MenuService;

@RestController
@RequestMapping("/ed/menu")
public class MenuEndpoint {

	@Autowired
	private MenuService menuService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public String findAll() {
        Gson gson = new Gson();
        return gson.toJson(menuService.findAll());
    }
}
