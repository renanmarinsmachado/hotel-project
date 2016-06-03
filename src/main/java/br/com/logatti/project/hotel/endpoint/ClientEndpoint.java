package br.com.logatti.project.hotel.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.logatti.project.hotel.entity.Client;
import br.com.logatti.project.hotel.service.ClientService;

@RestController
@RequestMapping("/ed/client")
public class ClientEndpoint {

	@Autowired
	private ClientService clientService; 
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public List<Client> findAll() {
        return clientService.findAll();
    }
}
