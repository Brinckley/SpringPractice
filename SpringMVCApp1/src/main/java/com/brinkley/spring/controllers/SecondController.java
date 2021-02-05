package com.brinkley.spring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {

    @GetMapping("/exit")
    public String ExitPage() {
        return "second/exit";
    }
}