package com.example.HomeAutomation_Project.Controller;

import com.example.HomeAutomation_Project.Domain.ApplianceSettings;
import com.example.HomeAutomation_Project.Domain.LightingSettings;
import com.example.HomeAutomation_Project.Domain.TemperatureSetting;
import com.example.HomeAutomation_Project.Repository.ApplianceSettingsRepository;
import com.example.HomeAutomation_Project.Repository.LightingSettingsRepository;
import com.example.HomeAutomation_Project.Repository.TemperatureSettingRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ModeSettingsController { // 모드 설정에 대한 컨트롤러

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
    public String setSleepMode() { // 취침모드를 선택했을 때의 설정 내용
        // 취침모드 설정
        LightingSettings lightingSettings = new LightingSettings();
        lightingSettings.setRoom1Light(false);
        lightingSettings.setRoom2Light(false);
        lightingSettings.setLivingRoomLight(false);
        lightingSettings.setKitchenLight(false);
        lightingSettings.setBathroomLight(false);
        lightingSettingsRepository.save(lightingSettings); // 조명 설정 저장

        TemperatureSetting temperatureSettings = new TemperatureSetting();
        temperatureSettings.setRoom1Temperature(24);
        temperatureSettings.setRoom2Temperature(24);
        temperatureSettings.setLivingRoomTemperature(24);
        temperatureSettingsRepository.save(temperatureSettings); // 난방 설정 저장

        ApplianceSettings applianceSettings = new ApplianceSettings();
        applianceSettings.setTvOn(false);
        applianceSettings.setAirConditionerOn(false);
        applianceSettings.setComputerOn(false);
        applianceSettingsRepository.save(applianceSettings); // 가전 제품 설정 저장

        return "redirect:/settings/settings";
    }

    @PostMapping("/settings/mode")
    public String setMode(@RequestParam("mode") String mode) {
        if ("sleep".equals(mode)) {
            setSleepMode();
        } else if ("away".equals(mode)) {
            setAwayMode();
        }
        return "redirect:/settings/settings";
    }

    @PostMapping("/settings/mode/away")
    public String setAwayMode() { // 외출모드를 선택했을때 설정 내용

        LightingSettings lightingSettings = new LightingSettings();
        lightingSettings.setRoom1Light(false);
        lightingSettings.setRoom2Light(false);
        lightingSettings.setLivingRoomLight(false);
        lightingSettings.setKitchenLight(false);
        lightingSettings.setBathroomLight(false);
        lightingSettingsRepository.save(lightingSettings); // 조명 설정 저장

        TemperatureSetting temperatureSettings = new TemperatureSetting();
        temperatureSettings.setRoom1Temperature(0);
        temperatureSettings.setRoom2Temperature(0);
        temperatureSettings.setLivingRoomTemperature(0);
        temperatureSettingsRepository.save(temperatureSettings); // 난방 설정 저장

        ApplianceSettings applianceSettings = new ApplianceSettings();
        applianceSettings.setTvOn(false);
        applianceSettings.setAirConditionerOn(false);
        applianceSettings.setComputerOn(false);
        applianceSettingsRepository.save(applianceSettings); // 가전 제품 설정 저장

        return "redirect:/settings/settings";
    }
}