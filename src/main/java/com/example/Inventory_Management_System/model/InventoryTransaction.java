package com.example.Inventory_Management_System.model;

import java.time.LocalDateTime;

import com.example.Inventory_Management_System.Constants.TransactionType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class InventoryTransaction {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private TransactionType transactionType;
	
	@ManyToOne
	private Product product;
	
	@ManyToOne
	private Warehouse warehouse;
	
	private Integer quantity;
    
	@ManyToOne
	private User createdBy;
	
	private LocalDateTime createdAt;
	
}
