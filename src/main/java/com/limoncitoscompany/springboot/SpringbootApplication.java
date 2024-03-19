package com.limoncitoscompany.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Date;

import com.limoncitoscompany.springboot.model.Client;
import com.limoncitoscompany.springboot.repository.ClientRepository;

@SpringBootApplication
public class SpringbootApplication  implements CommandLineRunner {
	@Autowired
	private ClientRepository clientRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	public void run(String... args) throws Exception{
		Date date = new Date();

		clientRepository.save(new Client("Television", "Electrinics","w" ,1 ,1,date));
		clientRepository.save(new Client("Television", "Electrinics","w" ,1 ,1,date));
		clientRepository.save(new Client("Television", "Electrinics","w" ,1 ,1,date));
		clientRepository.save(new Client("Television", "Electrinics","w" ,1 ,1,date));
		clientRepository.save(new Client("Television", "Electrinics","w" ,1 ,1,date));


	
	}
}

