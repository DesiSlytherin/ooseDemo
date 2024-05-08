package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Authentication;
import com.example.demo.service.AuthService;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/")
public class AuthController {
    @Autowired
    private AuthService service;

    @PostMapping("/log")
    public String login(@ModelAttribute("user") Authentication user) {
        //TODO: process POST request
        Authentication oAuthUser = service.login(user.getUsername(),user.getPassword());
        System.out.println(oAuthUser);
        if(Objects.nonNull(oAuthUser))
        {
            return "redirect:/disp";
        }
        else
        {
            return "redirect:/";
        }
     
    }
    @PostMapping("/register")
    public String register(@ModelAttribute("user")Authentication user)
    {
        service.saveUser(user.getUsername(), user.getPassword());
        return "redirect:/disp";
    }

    
    
}
