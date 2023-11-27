package com.example.HomeAutomation_Project;

import com.example.HomeAutomation_Project.ApplianceSettings;
import com.example.HomeAutomation_Project.ApplianceSettingsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApplianceSettingsController {

    private final ApplianceSettingsRepository applianceSettingsRepository;

    public ApplianceSettingsController(ApplianceSettingsRepository applianceSettingsRepository) {
        this.applianceSettingsRepository = applianceSettingsRepository;
    }

    @GetMapping("/settings/appliances")
    public String applianceSettings(Model model) {
        ApplianceSettings applianceSettings = applianceSettingsRepository.findById(1L).orElse(new ApplianceSettings());
        model.addAttribute("applianceSettings", applianceSettings);
        return "appliance_settings";
    }

    @PostMapping("/settings/appliances")
    public String saveApplianceSettings(ApplianceSettings applianceSettings) {
        applianceSettingsRepository.save(applianceSettings);
        return "redirect:/settings/appliances";
    }
}