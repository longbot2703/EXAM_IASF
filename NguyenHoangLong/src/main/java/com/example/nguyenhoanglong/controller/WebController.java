package com.example.nguyenhoanglong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class WebController {
    @GetMapping({"/login"})
    public String login(@RequestParam(value = "error", required = false) final String error,
                        final Model model) {
        if (error != null) {
            model.addAttribute("message", "Login Failed!");
        }
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam Map<String, String> params) {
        return "index";
    }
}
