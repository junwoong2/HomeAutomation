package com.example.HomeAutomation_Project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/settings")
    public String settings(Model model) {
        // 여기서 설정 관련 정보를 가져오거나 필요한 작업을 수행할 수 있습니다.
        return "settings";
    }
}
