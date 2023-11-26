package com.example.HomeAutomation_Project;

import com.example.HomeAutomation_Project.TemperatureSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureSettingRepository extends JpaRepository<TemperatureSetting, Long> {
}