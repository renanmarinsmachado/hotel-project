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
	
	public Menu findById(Long id){
		return menuRepository.findOne(id);
	}
	
	public void save(Menu menu){
		menuRepository.save(menu);
	}
	
	public Menu get(Long id){
		return menuRepository.findOne(id);
	}
	
	public void remove(Long id) {
		menuRepository.delete(id);
	}
}
