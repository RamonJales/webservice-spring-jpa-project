package com.br.webservicespringjpaproject.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.webservicespringjpaproject.model.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1 ,"maria", "maria@qw.com", "464614", "123senha");
		return ResponseEntity.ok().body(u);
	}
	
}
