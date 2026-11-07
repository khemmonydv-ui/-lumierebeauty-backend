package com.flashsolution.lumierebeauty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/api/test")
    public String testAPI() {
        return "Lumiere Beauty API is working!";
    }
}