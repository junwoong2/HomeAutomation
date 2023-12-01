package com.example.HomeAutomation_Project.Controller;

import com.example.HomeAutomation_Project.Domain.TemperatureSetting;
import com.example.HomeAutomation_Project.Repository.TemperatureSettingRepository;
import  org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HeatingSettingController { // 난방 설정에 대한 컨트롤러
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
        temperatureSettingRepository.save(temperatureSetting); // 데이터베이스에 저장
        return "redirect:/settings/settings";
    }
}
