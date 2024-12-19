package com.example.Voiture;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableFeignClients  // Enable Feign Clients
@EnableJpaRepositories(basePackages = "com.example.Voiture.repositories")
@EntityScan(basePackages = "com.example.Voiture.entities")
public class VoitureApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoitureApplication.class, args);
	}



}
