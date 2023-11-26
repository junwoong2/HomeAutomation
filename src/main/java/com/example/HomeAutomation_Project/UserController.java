package com.example.HomeAutomation_Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;



    @GetMapping("/register")
    public String registerForm() {
        return "register";
    }

    @PostMapping("/register")
    public String register(User user, Model model) {
        userRepository.save(user);
        model.addAttribute("registrationSuccess", true);
        return "redirect:/login";
    }



    @Autowired
    public UserController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        // 로그인 확인 로직을 호출
        if (userService.authenticate(username, password)) {
            // 로그인이 성공하면 설정 페이지로 이동
            return "redirect:/settings";
        } else {
            // 로그인이 실패하면 다시 로그인 페이지로 이동
            model.addAttribute("loginError", true);
            return "login";
        }
    }
}
