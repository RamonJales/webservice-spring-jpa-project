package com.br.webservicespringjpaproject.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.webservicespringjpaproject.model.entities.Product;
import com.br.webservicespringjpaproject.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Integer id) {
		return repository.findById(id).get();
	}
}
