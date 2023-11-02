package com.example.ist412project.controller;

import com.example.ist412project.model.UserInfo;
import com.example.ist412project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("user", new UserInfo());
        return "Login"; // Thymeleaf template name
    }

    @PostMapping("/login")
    public String loginSubmit(@RequestParam String userName, @RequestParam String password, Model model) {

        if (userService.validateUser(userName, password)) {
            // Successful login
            return "redirect:/success"; // Redirect
        } else {
            // Failed login, show an error message
            model.addAttribute("error", "Invalid username or password");
            return "redirect:/failure";
        }
    }
}
