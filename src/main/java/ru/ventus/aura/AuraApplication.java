package ru.ventus.aura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class AuraApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuraApplication.class, args);
	}

}
