package com.example.HomeAutomation_Project.Repository;

import com.example.HomeAutomation_Project.Domain.ApplianceSettings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplianceSettingsRepository extends JpaRepository<ApplianceSettings, Long> {
}