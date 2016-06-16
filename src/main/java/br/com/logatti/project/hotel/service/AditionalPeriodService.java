package br.com.logatti.project.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.logatti.project.hotel.entity.AditionalPeriod;
import br.com.logatti.project.hotel.repository.AditionalPeriodRepository;

@Service
public class AditionalPeriodService {

	@Autowired
	private AditionalPeriodRepository aditionalPeriodRepository;
	
	public void save(AditionalPeriod aditionalPeriod){
		aditionalPeriodRepository.save(aditionalPeriod);
	}
	
	public List<AditionalPeriod> findAll(){
		return (List<AditionalPeriod>) aditionalPeriodRepository.findAll();
	}
	
	public List<AditionalPeriod> findAllPeriod(Long idPeriod){
		return aditionalPeriodRepository.findByIdPeriod(idPeriod);
	}
}
