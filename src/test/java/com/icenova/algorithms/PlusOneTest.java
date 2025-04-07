package com.icenova.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneTest {

    @Test
    void testPlusOne_noCarry() {
        PlusOne plusOne = new PlusOne();
        int[] digits = {1, 2, 3};
        int[] result = plusOne.plusOne(digits);
        assertArrayEquals(new int[]{1, 2, 4}, result);
    }

    @Test
    void testPlusOne_withCarry() {
        PlusOne plusOne = new PlusOne();
        int[] digits = {1, 2, 9};
        int[] result = plusOne.plusOne(digits);
        assertArrayEquals(new int[]{1, 3, 0}, result);
    }

    @Test
    void testPlusOne_allNines() {
        PlusOne plusOne = new PlusOne();
        int[] digits = {9, 9, 9};
        int[] result = plusOne.plusOne(digits);
        assertArrayEquals(new int[]{1, 0, 0, 0}, result);
    }
}