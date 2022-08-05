package com.br.webservicespringjpaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.webservicespringjpaproject.model.entities.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

}
