package br.com.logatti.project.hotel.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import br.com.logatti.project.hotel.entity.Period;
import br.com.logatti.project.hotel.service.PeriodService;

@RestController
@RequestMapping("/ed/hotelperiod")
public class PeriodEndpoint {

	@Autowired
	private PeriodService periodService;
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
    public List<Period> findAll() {
        return (List<Period>) periodService.findAll();
    }
	
	@RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
    public String findAllJson() {
        List<Period> periods = periodService.findByPaymentStatus(false);
        
        Gson gson = new Gson();
        return gson.toJson(periods);
    }
}
