package com.example.SpringJDBC;

import com.example.SpringJDBC.model.Alien;
import com.example.SpringJDBC.repo.AlienRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);
		Alien alien = context.getBean(Alien.class);
		alien.setId(101);
		alien.setName("love");
		alien.setTech("java");

		AlienRepo repo = context.getBean(AlienRepo.class);
		repo.save(alien);
		System.out.println(repo.findAll());
	}

}
