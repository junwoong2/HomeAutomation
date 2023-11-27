package com.example.HomeAutomation_Project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController { // 로그인 화면에 대한 컨트롤러

    @GetMapping("/login")
    public String login(Model model) {

        return "login";
    }

    @GetMapping("/settings")
    public String settings(Model model) {
        return "settings";
    }
}
