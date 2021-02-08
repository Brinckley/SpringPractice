package com.brinkley.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.rmi.runtime.Log;

@Controller
public class CalculatorController {

    @GetMapping("/f")
    public void A(){
        System.out.println("fdfdfdsfds");
    }

    @GetMapping("/put")
    public String B(){
        return "first/put";
    }

    @GetMapping("/calculator")
    public String AnswerPage(@RequestParam(value = "a") int first,
                             @RequestParam(value = "b") int second,
                             @RequestParam(value = "op") String operation,
                             Model model){
        double answer = 0;
        switch (operation){
            case "plus":
                answer = first + second;
                break;
            case "minus":
                answer = first - second;
                break;
            case "multi":
                answer = first * second;
                break;
            case "div":
                if(second != 0){
                    answer = first / (double)second;
                } else {
                    System.out.println("ERROR!!!");
                }
                break;
            default:
                System.out.println("Unknown operation");
                break;
        }
        System.out.println("Finish");
        model.addAttribute("answer", answer);

        return "first/answerC";
    }
}
