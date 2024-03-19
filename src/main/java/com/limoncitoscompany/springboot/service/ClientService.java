package com.limoncitoscompany.springboot.service;

import com.limoncitoscompany.springboot.model.Client;
import com.limoncitoscompany.springboot.repository.ClientRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> getAllClient() {

		List<Client> client = new ArrayList<>();
		
		clientRepository.findAll().forEach(client::add);
		
		return client;
	}
	
	public Optional<Client> getClient(Long id) {
		return clientRepository.findById(id);
	}
	
	public void addClient(Client client) {
		clientRepository.save(client);
	}
	
	public void updateclient(Long id, Client client) {
		
		if (clientRepository.findById(id).get() != null) {
			clientRepository.save(client);
		}
	}
	
	public void deleteclient(Long id) {
		clientRepository.deleteById(id);
	}

}