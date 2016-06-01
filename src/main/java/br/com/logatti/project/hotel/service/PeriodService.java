package br.com.logatti.project.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.logatti.project.hotel.entity.Period;
import br.com.logatti.project.hotel.repository.PeriodRepository;

@Service
public class PeriodService {

	@Autowired
	private PeriodRepository periodRepository;
	
	public List<Period> findAll(){
		for(Period p : periodRepository.findAllFetch()){
			System.out.println(p);
		}
		return periodRepository.findAllFetch();
	}
}
