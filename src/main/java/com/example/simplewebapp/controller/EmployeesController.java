package com.example.simplewebapp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class EmployeesController {

    @GetMapping("/employees")
    public String employees(Model model) {
        return "employees";
    }
}
