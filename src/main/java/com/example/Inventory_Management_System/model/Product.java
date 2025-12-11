package com.example.Inventory_Management_System.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String sku;
	private String description;
    private BigDecimal price;
    @ManyToOne
    private Category productCategory;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    
}
