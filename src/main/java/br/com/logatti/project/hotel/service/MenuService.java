package br.com.logatti.project.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.logatti.project.hotel.entity.Menu;
import br.com.logatti.project.hotel.repository.MenuRepository;

@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;
	
	public List<Menu> findAll(){
		return (List<Menu>) menuRepository.findAll();
	}
}
