package com.icenova.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring lps;

    @BeforeEach
    void setUp() {
        lps = new LongestPalindromicSubstring();
    }

    @Test
    void testEmptyString() {
        assertEquals("", lps.longestPalindrome(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("a", lps.longestPalindrome("a"));
    }

    @Test
    void testTwoCharactersPalindrome() {
        assertEquals("aa", lps.longestPalindrome("aa"));
    }

    @Test
    void testTwoCharactersNonPalindrome() {
        assertEquals("a", lps.longestPalindrome("ab"));
    }

    @Test
    void testExample1() {
        assertEquals("bab", lps.longestPalindrome("babad"));
    }

    @Test
    void testExample2() {
        assertEquals("bb", lps.longestPalindrome("cbbd"));
    }

    @Test
    void testLongerPalindrome() {
        assertEquals("racecar", lps.longestPalindrome("abracecarxy"));
    }

    @Test
    void testMultiplePalindromes() {
        assertEquals("aba", lps.longestPalindrome("cababd"));
    }

    @Test
    void testAllSameCharacters() {
        assertEquals("aaaaa", lps.longestPalindrome("aaaaa"));
    }

    @Test
    void testNoValidPalindrome() {
        assertEquals("a", lps.longestPalindrome("abcdef"));
    }
}