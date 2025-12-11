package com.example.Inventory_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Inventory_Management_System.model.Stock;

public interface StockRepository extends JpaRepository<Stock,Long>{

}
