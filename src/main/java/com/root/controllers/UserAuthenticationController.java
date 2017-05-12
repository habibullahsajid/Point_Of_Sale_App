package com.root.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authenticate")
public class UserAuthenticationController {
    @GetMapping("/login")
    public String login(){
        return "index";
    }
}
