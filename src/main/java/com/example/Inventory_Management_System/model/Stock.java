package com.example.Inventory_Management_System.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(
	    name = "stock",
	    uniqueConstraints = {
	        @UniqueConstraint(columnNames = {"product_id", "warehouse_id"})
	    }
	)
public class Stock {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private Product product;
	
    @ManyToOne
	private Warehouse warehouse;

	private Integer quantity;

	private LocalDateTime updatedAt;

	
}
