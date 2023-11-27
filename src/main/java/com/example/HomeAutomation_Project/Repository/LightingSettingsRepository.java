package com.example.HomeAutomation_Project.Repository;

import com.example.HomeAutomation_Project.Domain.LightingSettings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LightingSettingsRepository extends JpaRepository<LightingSettings, Long> {
}
