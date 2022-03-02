package com.example.simplewebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeesController {

    @GetMapping("/employees")
    public String employees(Model model) {
        System.out.println("1");
        return "employees";
    }
}
