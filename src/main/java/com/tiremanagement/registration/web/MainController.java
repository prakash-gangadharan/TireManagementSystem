package com.tiremanagement.registration.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tiremanagement.registration.entity.User;
import com.tiremanagement.registration.repository.UserRepository;

@Controller
public class MainController {
    
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }
    
    @GetMapping("/dashboardUser")
    public String dashboardPageList(Model model, @AuthenticationPrincipal UserDetails currentUser ) {
    User user = (User) userRepository.findUserByUsername(currentUser.getUsername());
        model.addAttribute("currentStudent", user);

        return "dashboardUser";
    }
    
}
