package com.br.webservicespringjpaproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.webservicespringjpaproject.model.entities.OrderEntity;
import com.br.webservicespringjpaproject.servicies.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<OrderEntity>> findAll() {
		List<OrderEntity> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<OrderEntity> findById(@PathVariable Integer id) {
		OrderEntity obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
