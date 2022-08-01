package com.br.webservicespringjpaproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.webservicespringjpaproject.model.entities.UserEntity;
import com.br.webservicespringjpaproject.servicies.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<UserEntity>> findAll() {
		
		List<UserEntity> list = userService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<UserEntity> findById(@PathVariable Integer id) {
		UserEntity obj = userService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
