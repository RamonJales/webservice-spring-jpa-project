package com.br.webservicespringjpaproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.webservicespringjpaproject.model.entities.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer>{

}
