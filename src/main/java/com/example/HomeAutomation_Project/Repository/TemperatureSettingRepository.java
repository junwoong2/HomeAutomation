package com.example.HomeAutomation_Project.Repository;

import com.example.HomeAutomation_Project.Domain.TemperatureSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureSettingRepository extends JpaRepository<TemperatureSetting, Long> {
}