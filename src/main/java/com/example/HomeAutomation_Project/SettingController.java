package com.example.HomeAutomation_Project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SettingController {

    @GetMapping("/settings")
    public String settings(Model model) {
        // 여기서 설정 관련 정보를 가져오거나 필요한 작업을 수행할 수 있습니다.
        return "settings";
    }

    @GetMapping("/settings/heating")
    public String heatingSettings(Model model) {
        // 난방설정과 관련된 작업을 수행할 수 있습니다.
        return "heating_settings";
    }

    @GetMapping("/settings/lighting")
    public String lightingSettings(Model model) {
        // 조명설정과 관련된 작업을 수행할 수 있습니다.
        return "lighting_settings";
    }

    @GetMapping("/settings/appliances")
    public String appliancesSettings(Model model) {
        // 가전제품설정과 관련된 작업을 수행할 수 있습니다.
        return "appliances_settings";
    }

    @GetMapping("/settings/mode")
    public String modeSettings(Model model) {
        // 모드설정과 관련된 작업을 수행할 수 있습니다.
        return "mode_settings";
    }
}
