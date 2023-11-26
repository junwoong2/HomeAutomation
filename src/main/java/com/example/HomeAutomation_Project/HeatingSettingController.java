package com.example.HomeAutomation_Project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HeatingSettingController {

    private final TemperatureSettingRepository temperatureSettingRepository;

    public HeatingSettingController(TemperatureSettingRepository temperatureSettingRepository) {
        this.temperatureSettingRepository = temperatureSettingRepository;
    }

    @GetMapping("/settings/heating")
    public String heatingSettings(Model model) {
        TemperatureSetting temperatureSetting = temperatureSettingRepository.findById(1L).orElse(new TemperatureSetting());
        model.addAttribute("temperatureSetting", temperatureSetting);
        return "heating_setting";
    }

    @PostMapping("/settings/heating")
    public String saveHeatingSettings(TemperatureSetting temperatureSetting) {
        temperatureSettingRepository.save(temperatureSetting);
        return "redirect:/setting/heating";
    }
}
