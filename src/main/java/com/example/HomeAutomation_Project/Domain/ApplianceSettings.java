package com.example.HomeAutomation_Project.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class ApplianceSettings { // 난방 설정에 대한 엔티티
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    private boolean tvOn;
    @Getter
    private boolean airConditionerOn;
    @Getter
    private boolean computerOn;

    public void setTvOn(boolean tvOn) {
        this.tvOn = tvOn;
    }

    public void setAirConditionerOn(boolean airConditionerOn) {
        this.airConditionerOn = airConditionerOn;
    }

    public void setComputerOn(boolean computerOn) {
        this.computerOn = computerOn;
    }

}