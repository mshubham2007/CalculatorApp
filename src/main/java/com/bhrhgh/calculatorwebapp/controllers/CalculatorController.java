package com.bhrhgh.calculatorwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String showCalculator(Model model) {
        model.addAttribute("calculatorForm", new CalculatorForm());
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2,
            @RequestParam("operation") String operation,
            Model model) {
        
        int result;
        
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                result = num1 / num2;
                break;
            default:
                result = 0;
                break;
        }

        model.addAttribute("result", result);
        return "result";
    }
}
