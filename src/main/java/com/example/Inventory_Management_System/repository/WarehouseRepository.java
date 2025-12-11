package com.example.Inventory_Management_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Inventory_Management_System.model.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse,Long>{

}
