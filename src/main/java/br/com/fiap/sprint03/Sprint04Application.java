package br.com.fiap.sprint03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "br.com.fiap.sprint03.repository")
public class Sprint04Application {

	public static void main(String[] args) {
		SpringApplication.run(Sprint04Application.class, args);
	}

}