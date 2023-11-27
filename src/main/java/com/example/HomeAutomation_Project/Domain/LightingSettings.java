package com.example.HomeAutomation_Project.Domain;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class LightingSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private boolean room1Light;
    @Getter
    private boolean room2Light;
    @Getter
    private boolean livingRoomLight;
    @Getter
    private boolean kitchenLight;
    @Getter
    private boolean bathroomLight;

    // getters and setters

    public void setRoom1Light(boolean room1Light) {
        this.room1Light = room1Light;
    }

    public void setRoom2Light(boolean room2Light) {
        this.room2Light = room2Light;
    }

    public void setLivingRoomLight(boolean livingRoomLight) {
        this.livingRoomLight = livingRoomLight;
    }

    public void setKitchenLight(boolean kitchenLight) {
        this.kitchenLight = kitchenLight;
    }

    public void setBathroomLight(boolean bathroomLight) {
        this.bathroomLight = bathroomLight;
    }

}