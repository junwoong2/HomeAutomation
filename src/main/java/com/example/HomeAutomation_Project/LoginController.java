package com.example.HomeAutomation_Project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {

    @GetMapping("/login")
    public String login(Model model) {

        return "login";
    }

    @GetMapping("/settings")
    public String settings(Model model) {
        return "settings";
    }
}
