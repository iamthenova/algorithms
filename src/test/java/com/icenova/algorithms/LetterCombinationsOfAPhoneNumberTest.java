package com.icenova.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterCombinationsOfAPhoneNumberTest {

    private LetterCombinationsOfAPhoneNumber solution;

    @BeforeEach
    void setUp() {
        solution = new LetterCombinationsOfAPhoneNumber();
    }

    @Test
    void testExample1() {
        List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expected, solution.letterCombinations("23"));
    }

    @Test
    void testExample2() {
        List<String> expected = List.of();
        assertEquals(expected, solution.letterCombinations(""));
    }

    @Test
    void testExample3() {
        List<String> expected = List.of("a", "b", "c");
        assertEquals(expected, solution.letterCombinations("2"));
    }

    @Test
    void testSingleDigit() {
        List<String> expected = List.of("p", "q", "r", "s");
        assertEquals(expected, solution.letterCombinations("7"));
    }

    @Test
    void testMultipleDigits() {
        List<String> expected = List.of("gj", "gk", "gl", "hj", "hk", "hl", "ij", "ik", "il");
        assertEquals(expected, solution.letterCombinations("45"));
    }

    @Test
    void testInvalidDigit() {
        List<String> expected = List.of();
        assertEquals(expected, solution.letterCombinations("1"));
    }

    @Test
    void testZeroAndOne() {
        List<String> expected = List.of();
        assertEquals(expected, solution.letterCombinations("01"));
    }
}