package com.example.HomeAutomation_Project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/settings" +
        "")
public class SettingController { // 설정 화면에서 설정을 선택할 수 있는 컨트톨러

    @GetMapping("/settings")
    public String settings(Model model) {
        return "settings";
    }

    @GetMapping("/settings/heating") // 난방설정
    public String heatingSettings(Model model) {
        return "heating_setting";
    }

    @GetMapping("/settings/lighting") // 조명설정
    public String lightingSettings(Model model) {
        return "lighting_settings";
    }

    @GetMapping("/settings/appliances") // 가전제품설정
    public String appliancesSettings(Model model) {
        return "appliance_settings";
    }

    @GetMapping("/settings/mode") // 모드 설정
    public String modeSettings(Model model) {
        return "mode_settings";
    }
}
