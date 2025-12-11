package com.example.Inventory_Management_System.model;

import java.time.LocalDateTime;

import com.example.Inventory_Management_System.Constants.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String Username;
	private String password;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	private LocalDateTime createdAt;
}
