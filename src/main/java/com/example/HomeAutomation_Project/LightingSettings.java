package com.example.HomeAutomation_Project;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LightingSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean room1Light;
    private boolean room2Light;
    private boolean livingRoomLight;
    private boolean kitchenLight;
    private boolean bathroomLight;

    // getters and setters

    public boolean isRoom1Light() {
        return room1Light;
    }

    public void setRoom1Light(boolean room1Light) {
        this.room1Light = room1Light;
    }

    public boolean isRoom2Light() {
        return room2Light;
    }

    public void setRoom2Light(boolean room2Light) {
        this.room2Light = room2Light;
    }

    public boolean isLivingRoomLight() {
        return livingRoomLight;
    }

    public void setLivingRoomLight(boolean livingRoomLight) {
        this.livingRoomLight = livingRoomLight;
    }

    public boolean isKitchenLight() {
        return kitchenLight;
    }

    public void setKitchenLight(boolean kitchenLight) {
        this.kitchenLight = kitchenLight;
    }

    public boolean isBathroomLight() {
        return bathroomLight;
    }

    public void setBathroomLight(boolean bathroomLight) {
        this.bathroomLight = bathroomLight;
    }

    @Override
    public String toString() {
        return "LightingSettings{" +
                "id=" + id +
                ", room1Light=" + room1Light +
                ", room2Light=" + room2Light +
                ", livingRoomLight=" + livingRoomLight +
                ", kitchenLight=" + kitchenLight +
                ", bathroomLight=" + bathroomLight +
                '}';
    }
}