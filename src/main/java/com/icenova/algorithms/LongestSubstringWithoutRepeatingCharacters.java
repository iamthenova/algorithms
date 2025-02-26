package com.icenova.algorithms;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    //Example 1:
    //Input: s = "abcabcbb"
    //Output: 3
    //Explanation: The answer is "abc", with the length of 3.
    //
    //Example 2:
    //Input: s = "bbbbb"
    //Output: 1
    //Explanation: The answer is "b", with the length of 1.
    //
    //Example 3:
    //Input: s = "pwwkew"
    //Output: 3
    //Explanation: The answer is "wke", with the length of 3.
    //
    //Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
    public int lengthOfLongestSubstring(String s) {
        var maxSize = 0;
        var buffer = new HashSet<Character>();
        var leftPointer = 0;
        var rightPointer = 0;

        while (rightPointer < s.length()) {
            var c = s.charAt(rightPointer);
            if (buffer.contains(c)) {
                if (maxSize < buffer.size()) {
                    maxSize = buffer.size();
                }

                while (s.charAt(leftPointer) != c) {
                    buffer.remove(s.charAt(leftPointer));
                    leftPointer++;
                }
                leftPointer++;
                buffer.remove(c);
            } else {
                buffer.add(c);
                rightPointer++;
            }

            if (maxSize == 0 || maxSize < buffer.size()) {
                maxSize = buffer.size();
            }
        }

        return maxSize;
    }
}
