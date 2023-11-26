package com.example.HomeAutomation_Project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String apartmentBuilding; // 아파트 동
    private String apartmentNumber;   // 아파트 호

    // getters and setters
}