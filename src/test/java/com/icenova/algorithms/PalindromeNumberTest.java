package com.icenova.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {

    private final PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    void isPalindrome_True() {
        assertTrue(palindromeNumber.isPalindrome(121));
    }

    @Test
    void isPalindrome_False() {
        assertFalse(palindromeNumber.isPalindrome(20));
    }

    @Test
    void isPalindrome_NegativeNumber_False() {
        assertFalse(palindromeNumber.isPalindrome(-121));
    }
}