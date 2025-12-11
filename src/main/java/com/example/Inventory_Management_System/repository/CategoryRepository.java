package com.example.Inventory_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Inventory_Management_System.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
}
