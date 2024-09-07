package com.example.ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register"; // This will return register.html
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String firstName, @RequestParam String lastName,
                               @RequestParam String email, @RequestParam String phone,
                               @RequestParam String username, @RequestParam String password) {
        // Normally save user details to a database here
        return "redirect:/"; // Redirect to the main page after registration
    }
}