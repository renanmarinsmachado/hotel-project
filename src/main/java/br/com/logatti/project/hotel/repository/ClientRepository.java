package br.com.logatti.project.hotel.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.logatti.project.hotel.entity.Client;

public interface ClientRepository extends CrudRepository<Client, Long>{

}
