package com.icenova.algorithms;

import java.util.HashMap;

public class RomanToInteger {

    public int romanToInt(String s) {
        var res = 0;
        var roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            var currentRoman = roman.get(s.charAt(i));
            var nextRoman = roman.get(s.charAt(i + 1));

            if (currentRoman < nextRoman) {
                res -= currentRoman;
            } else {
                res += currentRoman;
            }
        }

        return res + roman.get(s.charAt(s.length() - 1));
    }
}
