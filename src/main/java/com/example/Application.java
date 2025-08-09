package com.example;
public class Application {
    public static void main(String[] args) {
        System.out.println("Test Java Application Started");
        Calculator calc = new Calculator();
        System.out.println("Test: 10 + 5 = " + calc.add(10, 5));
    }
    public static class Calculator {
        public int add(int a, int b) { return a + b; }
        public int subtract(int a, int b) { return a - b; }
    }
}
