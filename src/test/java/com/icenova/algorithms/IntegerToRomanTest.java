package com.icenova.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerToRomanTest {

    private IntegerToRoman converter;

    @BeforeEach
    void setUp() {
        converter = new IntegerToRoman();
    }

    @Test
    void testSingleDigitNumbers() {
        assertEquals("I", converter.intToRoman(1));
        assertEquals("V", converter.intToRoman(5));
        assertEquals("IX", converter.intToRoman(9));
    }

    @Test
    void testTwoDigitNumbers() {
        assertEquals("XI", converter.intToRoman(11));
        assertEquals("XV", converter.intToRoman(15));
        assertEquals("XL", converter.intToRoman(40));
        assertEquals("L", converter.intToRoman(50));
        assertEquals("XCIX", converter.intToRoman(99));
    }

    @Test
    void testThreeDigitNumbers() {
        assertEquals("C", converter.intToRoman(100));
        assertEquals("CD", converter.intToRoman(400));
        assertEquals("D", converter.intToRoman(500));
        assertEquals("CM", converter.intToRoman(900));
        assertEquals("DCCCXLV", converter.intToRoman(845));
    }

    @Test
    void testFourDigitNumbers() {
        assertEquals("M", converter.intToRoman(1000));
        assertEquals("MCMXCIX", converter.intToRoman(1999));
        assertEquals("MMXXI", converter.intToRoman(2021));
        assertEquals("MMMCMXCIX", converter.intToRoman(3999));
    }

    @Test
    void testEdgeCases() {
        assertEquals("", converter.intToRoman(0));
        assertEquals("MMMCMXCIX", converter.intToRoman(3999)); // Largest possible input
    }
}