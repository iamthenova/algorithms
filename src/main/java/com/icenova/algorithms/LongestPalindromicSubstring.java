package com.icenova.algorithms;

public class LongestPalindromicSubstring {

    //Example 1:
    //
    //Input: s = "babad"
    //Output: "bab"
    //Explanation: "aba" is also a valid answer.
    //Example 2:
    //
    //Input: s = "cbbd"
    //Output: "bb"
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        var res = "";
        var left = 0;
        while (left < s.length()) {
            for (int i = s.length() - 1; i >= left; i--) {
                var substring = s.substring(left, i + 1);
                var isPalindrome = isPalindrome(substring);

                if (isPalindrome && substring.length() > res.length()) {
                    res = substring;
                }
            }

            left++;
        }

        return res;
    }

    private boolean isPalindrome(String s) {
        var left = 0;
        var right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public String longestPalindromeOptimal(String s) {
        if (s == null || s.isEmpty()) return "";

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // Odd length palindromes
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindromes
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
