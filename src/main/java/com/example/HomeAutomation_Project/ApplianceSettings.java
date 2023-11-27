package com.example.HomeAutomation_Project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class ApplianceSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private boolean tvOn;
    @Getter
    private boolean airConditionerOn;
    @Getter
    private boolean computerOn;

    // getters and setters

    public void setTvOn(boolean tvOn) {
        this.tvOn = tvOn;
    }

    public void setAirConditionerOn(boolean airConditionerOn) {
        this.airConditionerOn = airConditionerOn;
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