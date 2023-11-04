package com.example.ist412project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.ist412project.service.UserService;
import com.example.ist412project.model.UserInfo;

@Controller
public class ApplyController {

    @Autowired
    private UserService userService;
    @GetMapping("/apply")
    public String showApplyPage() {
        return "apply";
    }
}
