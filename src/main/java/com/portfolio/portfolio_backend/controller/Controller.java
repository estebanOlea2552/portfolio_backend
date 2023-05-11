package com.portfolio.portfolio_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/")
    public String holaMundo(){
        return "Hola mundo";
    }
    @PostMapping("/")
    public String holaPost(){
        return "Hola Post";
    }
}
