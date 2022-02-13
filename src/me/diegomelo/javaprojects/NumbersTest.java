package me.diegomelo.javaprojects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @org.junit.jupiter.api.Test
    void Pi(){
        assertEquals(3.141592653589793, Numbers.Pi(100), 0.00001);
    }

    @Test
    void factorial() {
        assertEquals(1, Numbers.factorial(0));
        assertEquals(1, Numbers.factorial(1));
        assertEquals(2, Numbers.factorial(2));
        assertEquals(120, Numbers.factorial(5));
    }

    @Test
    void E() {
        assertEquals(2.718281828459045, Numbers.E(30), 0.00001);
    }

    @Test
    void Fibonacci(){
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34}, Numbers.fibonacci(10));
    }
}