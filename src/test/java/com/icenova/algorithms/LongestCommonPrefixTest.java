package com.icenova.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    void testEmptyArray() {
        String[] input = {};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void testSingleString() {
        String[] input = {"hello"};
        assertEquals("hello", longestCommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void testCommonPrefix() {
        String[] input = {"flower", "flow", "flight"};
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void testNoCommonPrefix() {
        String[] input = {"dog", "racecar", "car"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void testAllSameStrings() {
        String[] input = {"aa", "aa", "aa"};
        assertEquals("aa", longestCommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void testDifferentLengths() {
        String[] input = {"abc", "abcd", "abcde", "ab"};
        assertEquals("ab", longestCommonPrefix.longestCommonPrefix(input));
    }

    @Test
    void testEmptyString() {
        String[] input = {"", "b"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(input));
    }
}