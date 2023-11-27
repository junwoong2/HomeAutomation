package com.example.HomeAutomation_Project.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class TemperatureSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private int room1Temperature;
    @Getter
    private int room2Temperature;
    @Getter
    private int livingRoomTemperature;

    // getters and setters

    public void setRoom1Temperature(int room1Temperature) {
        this.room1Temperature = room1Temperature;
    }

    public void setRoom2Temperature(int room2Temperature) {
        this.room2Temperature = room2Temperature;
    }

    public void setLivingRoomTemperature(int livingRoomTemperature) {
        this.livingRoomTemperature = livingRoomTemperature;
    }

}