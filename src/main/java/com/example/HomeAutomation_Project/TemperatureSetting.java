package com.example.HomeAutomation_Project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TemperatureSetting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int room1Temperature;
    private int room2Temperature;
    private int livingRoomTemperature;

    // getters and setters

    public int getRoom1Temperature() {
        return room1Temperature;
    }

    public void setRoom1Temperature(int room1Temperature) {
        this.room1Temperature = room1Temperature;
    }

    public int getRoom2Temperature() {
        return room2Temperature;
    }

    public void setRoom2Temperature(int room2Temperature) {
        this.room2Temperature = room2Temperature;
    }

    public int getLivingRoomTemperature() {
        return livingRoomTemperature;
    }

    public void setLivingRoomTemperature(int livingRoomTemperature) {
        this.livingRoomTemperature = livingRoomTemperature;
    }

    @Override
    public String toString() {
        return "TemperatureSettings{" +
                "id=" + id +
                ", room1Temperature=" + room1Temperature +
                ", room2Temperature=" + room2Temperature +
                ", livingRoomTemperature=" + livingRoomTemperature +
                '}';
    }
}