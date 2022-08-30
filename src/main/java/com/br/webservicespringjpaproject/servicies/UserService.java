package com.br.webservicespringjpaproject.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.webservicespringjpaproject.model.entities.UserEntity;
import com.br.webservicespringjpaproject.repositories.UserRepository;
import com.br.webservicespringjpaproject.servicies.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<UserEntity> findAll() {
		return repository.findAll();
	}
	
	public UserEntity findById(Integer id) {
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public UserEntity insert(UserEntity obj) {
		return repository.save(obj);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
	public UserEntity update(Integer id, UserEntity obj) {
		UserEntity entity = repository.findById(id).get();
		updateData(entity, obj);
		return repository.save(entity);
		
	}

	private void updateData(UserEntity entity, UserEntity obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
