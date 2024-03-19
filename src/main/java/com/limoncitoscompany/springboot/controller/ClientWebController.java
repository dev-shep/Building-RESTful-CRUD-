package com.limoncitoscompany.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.limoncitoscompany.springboot.model.Client;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ClientWebController {
   @Autowired
   ClientController clientController;

   @GetMapping("/")
   public String getAllClient(Model model) {
       
       List<Client> clientsList = clientController.getAllClients();

       model.addAttribute("clients", clientsList);

       return "client/list_client";
   }

   @GetMapping("/new_client")
   public String addProduct(Model model) {

       Client client = new Client();

       model.addAttribute("client", client);

       return "new_client";
   }

	@PostMapping("/save_new")
	public String saveNewProduct(Client client) {

		clientController.addClient(client);

		return "redirect:/";
	}


    @GetMapping("/update_client/{pId}")
	public String editClient(@PathVariable(name = "pId") Long id, Model model) {

		model.addAttribute("client", clientController.getClient(id));
		
		return "/update_client";
	}

	@PostMapping(value = "/save_update")
	public String saveUpdateClient(@ModelAttribute("client") Client client) {
		clientController.updateClient(client, client.getId());
		return "redirect:/client";
	}
	
    
	@GetMapping("/delete_client/{pId}")
	public String deleteClient(@PathVariable("pId") Long id, Model model)  {

		model.addAttribute("client", clientController.getClient(id));

		return "/delete_client";
	}
	
	
	@PostMapping("/save_delete")
	public String saveDeleteClientt(@ModelAttribute("client") Client client)  {

		clientController.deleteClient(client.getId());

		return "redirect:/client";
	}
}

