package com.nerryjf.meu.primeiro.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nerryjf.meu.primeiro.projeto.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}