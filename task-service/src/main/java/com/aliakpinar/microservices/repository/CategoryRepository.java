package com.aliakpinar.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aliakpinar.microservices.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{
	Category findByName(String name);
}
