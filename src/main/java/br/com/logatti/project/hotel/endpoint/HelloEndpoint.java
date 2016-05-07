package br.com.logatti.project.hotel.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEndpoint {

	@RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
