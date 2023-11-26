package com.example.HomeAutomation_Project;

import com.example.HomeAutomation_Project.ApplianceSettings;
import com.example.HomeAutomation_Project.ApplianceSettingsRepository;
import com.example.HomeAutomation_Project.LightingSettingsRepository;
import com.example.HomeAutomation_Project.TemperatureSettingRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ModeSettingsController {

    private final LightingSettingsRepository lightingSettingsRepository;
    private final TemperatureSettingRepository temperatureSettingsRepository;
    private final ApplianceSettingsRepository applianceSettingsRepository;

    public ModeSettingsController(LightingSettingsRepository lightingSettingsRepository,
                                  TemperatureSettingRepository temperatureSettingsRepository,
                                  ApplianceSettingsRepository applianceSettingsRepository) {
        this.lightingSettingsRepository = lightingSettingsRepository;
        this.temperatureSettingsRepository = temperatureSettingsRepository;
        this.applianceSettingsRepository = applianceSettingsRepository;
    }

    @GetMapping("/settings/mode")
    public String modeSettings(Model model) {
        // 모드 설정과 관련된 작업을 수행할 수 있습니다.
        return "mode_settings";
    }

    @PostMapping("/settings/mode/sleep")
    public String setSleepMode() {
        // 취침모드 설정
        LightingSettings lightingSettings = new LightingSettings();
        lightingSettings.setRoom1Light(false);
        lightingSettings.setRoom2Light(false);
        lightingSettings.setLivingRoomLight(false);
        lightingSettings.setKitchenLight(false);
        lightingSettings.setBathroomLight(false);
        lightingSettingsRepository.save(lightingSettings);

        TemperatureSetting temperatureSettings = new TemperatureSetting();
        temperatureSettings.setRoom1Temperature(24);
        temperatureSettings.setRoom2Temperature(24);
        temperatureSettings.setLivingRoomTemperature(24);
        temperatureSettingsRepository.save(temperatureSettings);

        ApplianceSettings applianceSettings = new ApplianceSettings();
        applianceSettings.setTvOn(false);
        applianceSettings.setAirConditionerOn(false);
        applianceSettings.setComputerOn(false);
        applianceSettingsRepository.save(applianceSettings);

        return "redirect:/settings/mode";
    }

    @PostMapping("/settings/mode/away")
    public String setAwayMode() {
        // 외출모드 설정
        LightingSettings lightingSettings = new LightingSettings();
        lightingSettings.setRoom1Light(false);
        lightingSettings.setRoom2Light(false);
        lightingSettings.setLivingRoomLight(false);
        lightingSettings.setKitchenLight(false);
        lightingSettings.setBathroomLight(false);
        lightingSettingsRepository.save(lightingSettings);

        TemperatureSetting temperatureSettings = new TemperatureSetting();
        temperatureSettings.setRoom1Temperature(0);
        temperatureSettings.setRoom2Temperature(0);
        temperatureSettings.setLivingRoomTemperature(0);
        temperatureSettingsRepository.save(temperatureSettings);

        ApplianceSettings applianceSettings = new ApplianceSettings();
        applianceSettings.setTvOn(false);
        applianceSettings.setAirConditionerOn(false);
        applianceSettings.setComputerOn(false);
        applianceSettingsRepository.save(applianceSettings);

        return "redirect:/settings/mode";
    }
}