package com.spring.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by eric-nasc on 26/01/17.
 */
@RestController
public class HomeController {

    @Value("${config.name:Alou}")
    private String name;

    @RequestMapping("/")
    public String home() {
        return "Hello "+ this.name;
    }
}
