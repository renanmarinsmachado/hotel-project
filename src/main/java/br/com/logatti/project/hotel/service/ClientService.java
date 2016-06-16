package br.com.logatti.project.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.logatti.project.hotel.entity.Client;
import br.com.logatti.project.hotel.repository.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> findAll(){
		return (List<Client>) clientRepository.findAll();
	}
	
	public Client findById(Long id){
		return clientRepository.findOne(id);
	}
	
	public void save(Client client){
		clientRepository.save(client);
	}
	
	public Client get(Long id){
		return clientRepository.findOne(id);
	}
	
	public void remove(Long id) {
		clientRepository.delete(id);
	}
}
