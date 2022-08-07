package com.br.webservicespringjpaproject.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.webservicespringjpaproject.model.entities.CategoryEntity;
import com.br.webservicespringjpaproject.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository repository;
	
	public List<CategoryEntity> findAll() {
		return repository.findAll();
	}
	
	public CategoryEntity findById(Integer id) {
		return repository.findById(id).get();
	}
}
