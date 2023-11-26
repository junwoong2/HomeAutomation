package com.example.HomeAutomation_Project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LightingSettingsController {

    private final LightingSettingsRepository lightingSettingsRepository;

    public LightingSettingsController(LightingSettingsRepository lightingSettingsRepository) {
        this.lightingSettingsRepository = lightingSettingsRepository;
    }

    @GetMapping("/settings/lighting")
    public String lightingSettings(Model model) {
        LightingSettings lightingSettings = lightingSettingsRepository.findById(1L).orElse(new LightingSettings());
        model.addAttribute("lightingSettings", lightingSettings);
        return "lighting_settings";
    }

    @PostMapping("/settings/lighting")
    public String saveLightingSettings(LightingSettings lightingSettings) {
        lightingSettingsRepository.save(lightingSettings);
        return "redirect:/settings/lighting";
    }
}