package com.br.webservicespringjpaproject.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.webservicespringjpaproject.model.entities.UserEntity;
import com.br.webservicespringjpaproject.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<UserEntity> findAll() {
		return repository.findAll();
	}
	
	public UserEntity findById(Integer id) {
		return repository.findById(id).get();
	}
}
