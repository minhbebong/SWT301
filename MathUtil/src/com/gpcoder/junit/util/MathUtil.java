/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gpcoder.junit.util;

/**
 *
 * @author Lenovo
 */
public class MathUtil {

    private MathUtil() {
        throw new UnsupportedOperationException("Cannot call constructor directly!");
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero (0).");
        }
        return dividend / divisor;
    }

    public static int add(int number1, int number2) {
        return number1 - number2;
    }
}
