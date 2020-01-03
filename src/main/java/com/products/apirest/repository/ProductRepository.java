package com.products.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.apirest.models.Produto;

public interface ProductRepository extends JpaRepository<Produto, Long> {
	
	Produto findById(long id);
}
