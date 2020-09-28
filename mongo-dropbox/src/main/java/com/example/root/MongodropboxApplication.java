package com.example.root;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.root.repo.UserFileRepository;
@Configuration
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = UserFileRepository.class)
public class MongodropboxApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MongodropboxApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		
	}
	
	
}
