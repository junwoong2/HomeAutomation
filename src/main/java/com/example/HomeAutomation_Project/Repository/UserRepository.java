package com.example.HomeAutomation_Project.Repository;

import com.example.HomeAutomation_Project.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
}
