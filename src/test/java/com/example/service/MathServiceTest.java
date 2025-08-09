package com.example.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MathServiceTest {
    private MathService mathService;
    @BeforeEach
    void setUp() { mathService = new MathService(); }
    @Test
    void testAdd() { assertEquals(8, mathService.add(5, 3)); }
    @Test
    void testSubtract() { assertEquals(2, mathService.subtract(5, 3)); }
    @Test
    void testMultiply() { assertEquals(15, mathService.multiply(5, 3)); }
    @Test
    void testDivide() { assertEquals(2.5, mathService.divide(5, 2), 0.001); }
    @Test
    void testDivideByZero() { assertThrows(IllegalArgumentException.class, () -> mathService.divide(5, 0)); }
    @Test
    void testIsEven() { assertTrue(mathService.isEven(4)); assertFalse(mathService.isEven(3)); }
}
