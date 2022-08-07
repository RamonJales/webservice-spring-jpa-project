package com.br.webservicespringjpaproject.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.br.webservicespringjpaproject.enums.OrderStatus;
import com.br.webservicespringjpaproject.model.entities.CategoryEntity;
import com.br.webservicespringjpaproject.model.entities.OrderEntity;
import com.br.webservicespringjpaproject.model.entities.UserEntity;
import com.br.webservicespringjpaproject.repositories.CategoryRepository;
import com.br.webservicespringjpaproject.repositories.OrderRepository;
import com.br.webservicespringjpaproject.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		CategoryEntity cat1 = new CategoryEntity(null, "Electronics");
		CategoryEntity cat2 = new CategoryEntity(null, "Books");
		CategoryEntity cat3 = new CategoryEntity(null, "Computers");
		
		UserEntity u1 = new UserEntity(null ,"maria", "maria14@gail.com", "46445614", "123senha");
		UserEntity u2 = new UserEntity(null ,"joao", "joao53@gmail.com", "48973133", "45662a");
		
		OrderEntity o1 = new OrderEntity(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		OrderEntity o2 = new OrderEntity(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.DELIVERED, u2);
		OrderEntity o3 = new OrderEntity(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.CANCELED, u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
	}
	
	
}
