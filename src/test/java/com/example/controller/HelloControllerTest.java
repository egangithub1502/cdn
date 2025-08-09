package com.example.controller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class HelloControllerTest {
    private HelloController controller;
    @BeforeEach
    void setUp() { controller = new HelloController(); }
    @Test
    void testSayHello() { assertEquals("Hello, John!", controller.sayHello("John")); }
    @Test
    void testSayHelloNull() { assertEquals("Hello, World!", controller.sayHello(null)); }
    @Test
    void testCalculateSum() { assertEquals("Sum of 10 and 5 is: 15", controller.calculateSum(10, 5)); }
    @Test
    void testGetStatus() { assertEquals("Application is running successfully!", controller.getStatus()); }
}
