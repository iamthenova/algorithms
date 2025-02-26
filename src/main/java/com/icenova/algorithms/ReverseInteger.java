package com.icenova.algorithms;

public class ReverseInteger {

    //Example 1:
    //
    //Input: x = 123
    //Output: 321
    //Example 2:
    //
    //Input: x = -123
    //Output: -321
    //Example 3:
    //
    //Input: x = 120
    //Output: 21
    public int reverse(int x) {
        var isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = Math.abs(x);
        }

        var sb = new StringBuilder(String.valueOf(x));

        if (isNegative) {
            sb.append("-");
        }

        try {
            return Integer.parseInt(sb.reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
