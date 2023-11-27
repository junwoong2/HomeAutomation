package com.example.HomeAutomation_Project.Domain;

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

    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setApartmentBuilding(String apartmentBuilding){
        this.apartmentBuilding = apartmentBuilding;
    }
    public void setApartmentNumber(String apartmentNumber){
        this.apartmentNumber = apartmentNumber;
    }

}