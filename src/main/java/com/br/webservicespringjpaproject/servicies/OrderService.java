package com.br.webservicespringjpaproject.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.webservicespringjpaproject.model.entities.OrderEntity;
import com.br.webservicespringjpaproject.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<OrderEntity> findAll() {
		return orderRepository.findAll();
	}
	
	public OrderEntity findById(Integer id) {
		return orderRepository.findById(id).get();
	}
}
