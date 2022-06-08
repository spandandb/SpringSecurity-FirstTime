package com.security.springboot.security.learn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "this is the HOME page";
    }

    @GetMapping("/login")
    public String login() {
        return "this is the LOGIN page";
    }

    @GetMapping("/register")
    public String resgister() {
        return "this is the REGISTRATION page";
    }

}
