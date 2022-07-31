package com.br.webservicespringjpaproject.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.br.webservicespringjpaproject.model.entities.UserEntity;
import com.br.webservicespringjpaproject.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		UserEntity u1 = new UserEntity(null ,"maria", "maria14@gail.com", "46445614", "123senha");
		UserEntity u2 = new UserEntity(null ,"joao", "joao53@gmail.com", "48973133", "45662a");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
