package com.example.HomeAutomation_Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticate(String username, String password) {
        // UserRepository를 사용하여 데이터베이스에서 사용자를 찾아옵니다.
        User user = userRepository.findByUsernameAndPassword(username, password);
        return user != null;
    }
}