package com.br.webservicespringjpaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.webservicespringjpaproject.model.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
