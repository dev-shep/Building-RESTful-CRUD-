package com.limoncitoscompany.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import  com.limoncitoscompany.springboot.exception.ProductNotFoundException;
import com.limoncitoscompany.springboot.model.Client;
import com.limoncitoscompany.springboot.service.ClientService;

@RestController
public class ClientController {

	@Autowired
	private ClientService clientService;

	@GetMapping("/client")
	public List<Client> getAllClients() {

		return clientService.getAllClient();
	}
	
	@GetMapping("/client/{pId}")
	public Client getClient(@PathVariable("pId") Long id) {

		return clientService.getClient(id).orElseThrow(() -> new ProductNotFoundException(id));
	}

	@PostMapping("/clientAddClient")
	public void addClient(@RequestBody Client client) {

		clientService.addClient(client);
	}

	@PutMapping("/client/{pId}")
	public void updateClient(@RequestBody Client client, 
			@PathVariable("pId") Long id) {

		clientService.updateclient(id, client);
	}
	
	@DeleteMapping("/client/{pId}")
	public void deleteClient(@PathVariable("pId") Long id) {
		
		clientService.deleteclient(id);
	}
}

