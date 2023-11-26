package com.example.HomeAutomation_Project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ApplianceSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean tvOn;
    private boolean airConditionerOn;
    private boolean computerOn;

    // getters and setters

    public boolean isTvOn() {
        return tvOn;
    }

    public void setTvOn(boolean tvOn) {
        this.tvOn = tvOn;
    }

    public boolean isAirConditionerOn() {
        return airConditionerOn;
    }

    public void setAirConditionerOn(boolean airConditionerOn) {
        this.airConditionerOn = airConditionerOn;
    }

    public boolean isComputerOn() {
        return computerOn;
    }

    public void setComputerOn(boolean computerOn) {
        this.computerOn = computerOn;
    }

    @Override
    public String toString() {
        return "ApplianceSettings{" +
                "id=" + id +
                ", tvOn=" + tvOn +
                ", airConditionerOn=" + airConditionerOn +
                ", computerOn=" + computerOn +
                '}';
    }
}