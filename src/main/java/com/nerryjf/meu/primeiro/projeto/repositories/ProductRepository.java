package com.nerryjf.meu.primeiro.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nerryjf.meu.primeiro.projeto.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	
}