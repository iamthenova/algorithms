package com.icenova.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters solution;

    @BeforeEach
    void setUp() {
        solution = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    void testExample1() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void testExample2() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void testExample3() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }

    @Test
    void testOnlyStrangeCharacters() {
        assertEquals(1, solution.lengthOfLongestSubstring(" "));
    }

    @Test
    void test() {
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    void test2() {
        assertEquals(6, solution.lengthOfLongestSubstring("asjrgapa"));
    }

    @Test
    void testSingleCharacter() {
        assertEquals(1, solution.lengthOfLongestSubstring("a"));
    }

    @Test
    void testAllUniqueCharacters() {
        assertEquals(5, solution.lengthOfLongestSubstring("abcde"));
    }

    @Test
    void testLongestSubstringAtEnd() {
        assertEquals(5, solution.lengthOfLongestSubstring("aabcde"));
    }

    @Test
    void testLongestSubstringAtBeginning() {
        assertEquals(4, solution.lengthOfLongestSubstring("abcdaa"));
    }

    @Test
    void testLongestSubstringInMiddle() {
        assertEquals(6, solution.lengthOfLongestSubstring("abbcdefgg"));
    }
}