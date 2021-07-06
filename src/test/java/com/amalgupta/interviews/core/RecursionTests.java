package com.amalgupta.interviews.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RecursionTests {

    @Tag("Strings")
    @DisplayName("Reverse String using Recursion")
    @Test
    public void testString() {
        String input = "12345";
        Assertions.assertEquals("54321", reverse(input));
    }


    /**
     * Find the sum of Fiboncci numbers from 1 to n using recursion.
     */
    @Tag("Recursion")
    @Tag("Fibonacci")
    @DisplayName("Fibonacci using Recursion")
    @Test
    public void testFibonacciSum() {
        int n = 5;
        Assertions.assertEquals(12, fibonacciSum(n));
    }

    /**
     * Mathematical Theorem exists
     * If Fib(n) = Fib(n - 1) + Fib(n - 2), given Fib(1) = 1 & Fib(0) = 0
     *
     * Sum of Fibonacci numbers till n = > S(n) = Fib(n+2) - 1
     * https://proofwiki.org/wiki/Sum_of_Sequence_of_Fibonacci_Numbers
     * @param n
     * @return
     */
    public int fibonacciSum(int n) {
        return fibn(n + 2) - 1;
    }

    public int fibn(int n) {
        if (n <= 1) return n;
        return fibn(n - 1) + fibn(n - 2);
    }




    public String reverse(String input) {
        return (input.length() == 1) ? input : input.charAt(input.length()-1)+reverse(input.substring(0, input.length()-1));
    }

}

