package com.example.controller;

import com.example.service.MathService;

public class HelloController {
    
    private MathService mathService;
    
    public HelloController() {
        this.mathService = new MathService();
    }
    
    public String sayHello(String name) {
        if (name == null || name.isEmpty()) {
            name = "World";
        }
        return "Hello, " + name + "!";
    }
    
    public String calculateSum(int a, int b) {
        int result = mathService.add(a, b);
        return String.format("Sum of %d and %d is: %d", a, b, result);
    }
    
    public String getStatus() {
        return "Application is running successfully!";
    }
}
