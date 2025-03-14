package com.icenova.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    @Test
    void testStrStr_Found() {
        FindTheIndexOfTheFirstOccurrenceInAString finder = new FindTheIndexOfTheFirstOccurrenceInAString();
        assertEquals(2, finder.strStr("hello", "ll"));
    }

    @Test
    void testStrStr_NotFound() {
        FindTheIndexOfTheFirstOccurrenceInAString finder = new FindTheIndexOfTheFirstOccurrenceInAString();
        assertEquals(-1, finder.strStr("aaaaa", "bba"));
    }

    @Test
    void testStrStr_EmptyHaystack() {
        FindTheIndexOfTheFirstOccurrenceInAString finder = new FindTheIndexOfTheFirstOccurrenceInAString();
        assertEquals(-1, finder.strStr("", "a"));
    }
}