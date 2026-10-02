package com.kucsa.register.controller;

import com.kucsa.register.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class registrationController {

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("student", new Student());
        return "register"; //Maps to register.html
    }

    @PostMapping("/register")
    public String processRegistration(@ModelAttribute("student") Student student, Model model) {
        //Saving the student database(MySQL/PostgreSQL)
        System.out.println("New KUCSA Member Registered: " + student.getFullName());

        model.addAttribute("message", "Success! Welcome to KUCSA, " + student.getFullName() + "!");
        return "success"; // Maps to success.html
    }
}