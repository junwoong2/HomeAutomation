package com.example.HomeAutomation_Project.Controller;

import com.example.HomeAutomation_Project.Domain.User;
import com.example.HomeAutomation_Project.Repository.UserRepository;
import com.example.HomeAutomation_Project.Service.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController { // 사용자에 대한 컨트롤러 & 회원가입 컨트롤러
    private final UserRepository userRepository;
    private final UserService userService;

    @GetMapping("/register")
    public String registerForm() {
        return "register";
    }

    @Transactional
    @PostMapping("/register")
    public String register(User user, Model model) {
        try {
            userRepository.save(user);
            model.addAttribute("registrationSuccess", true);
            return "redirect:/user/login";
        } catch (Exception e) {
            // 예외 처리 코드 추가 (예: 로깅)
            e.printStackTrace();
            model.addAttribute("registrationError", true);
            return "register";  // 실패 시 다시 등록 페이지로 이동
        }
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
            // 로그인이 성공하면 사용자를 데이터베이스에서 조회
            User user = userRepository.findByUsernameAndPassword(username, password);

            if (user != null) {
                // 로그인이 성공하면 설정 페이지로 이동
                return "redirect:/settings/settings";
            } else {
                // 사용자가 데이터베이스에 존재하지 않을 경우 예외 처리
                model.addAttribute("loginError", true);
                return "login";
            }
        } else {
            // 로그인이 실패하면 다시 로그인 페이지로 이동
            model.addAttribute("loginError", true);
            return "login";
        }
    }
}
