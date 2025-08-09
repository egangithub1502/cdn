package com.example.controller;
import com.example.service.MathService;
public class HelloController {
    private MathService mathService = new MathService();
    public String sayHello(String name) {
        return "Hello, " + (name == null || name.isEmpty() ? "World" : name) + "!";
    }
    public String calculateSum(int a, int b) {
        return String.format("Sum of %d and %d is: %d", a, b, mathService.add(a, b));
    }
    public String getStatus() { return "Application is running successfully!"; }
}
