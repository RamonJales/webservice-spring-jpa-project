package com.br.webservicespringjpaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.webservicespringjpaproject.model.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {}
