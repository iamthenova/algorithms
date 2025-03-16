package com.icenova.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivideTwoIntegersTest {

    @Test
    void testDivide_PositiveResult() {
        DivideTwoIntegers divider = new DivideTwoIntegers();
        assertEquals(3, divider.divide(10, 3));
    }

    @Test
    void testDivide_NegativeResult() {
        DivideTwoIntegers divider = new DivideTwoIntegers();
        assertEquals(-2, divider.divide(7, -3));
    }

    @Test
    void testDivide_ZeroDividend() {
        DivideTwoIntegers divider = new DivideTwoIntegers();
        assertEquals(0, divider.divide(0, 1));
    }

    @Test
    void testDivide_OneDivisor() {
        DivideTwoIntegers divider = new DivideTwoIntegers();
        assertEquals(10, divider.divide(10, 1));
    }

    @Test
    void testDivide_NegativeDividend() {
        DivideTwoIntegers divider = new DivideTwoIntegers();
        assertEquals(-3, divider.divide(-10, 3));
    }

    @Test
    void testDivide_NegativeDivisor() {
        DivideTwoIntegers divider = new DivideTwoIntegers();
        assertEquals(-3, divider.divide(10, -3));
    }

    @Test
    void testDivide_BothNegative() {
        DivideTwoIntegers divider = new DivideTwoIntegers();
        assertEquals(3, divider.divide(-10, -3));
    }

    @Test
    void testDivide_DivisorGreaterThanDividend() {
        DivideTwoIntegers divider = new DivideTwoIntegers();
        assertEquals(0, divider.divide(3, 10));
    }

    @Test
    void testDivide_() {
        DivideTwoIntegers divider = new DivideTwoIntegers();
        assertEquals(2147483647, divider.divide(-2147483648, -1));
    }
}