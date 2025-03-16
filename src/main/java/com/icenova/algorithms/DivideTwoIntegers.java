package com.icenova.algorithms;

public class DivideTwoIntegers {

    //Example 1:
    //Input: dividend = 10, divisor = 3
    //Output: 3
    //Explanation: 10/3 = 3.33333... which is truncated to 3.
    //
    //Example 2:
    //Input: dividend = 7, divisor = -3
    //Output: -2
    //Explanation: 7/-3 = -2.33333... which is truncated to -2.
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        var absDividend = Math.abs((long) dividend);
        var absDivisor = Math.abs((long) divisor);

        if (absDivisor > absDividend) {
            return 0;
        }

        var isPositive = (dividend >= 0) == (divisor >= 0);

        var result = 0L;
        while (absDividend >= absDivisor) {
            var temp = absDivisor;
            var multiple = 1L;

            while (absDividend >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            absDividend -= temp;
            result += multiple;
        }

        if (result > Integer.MAX_VALUE) {
            return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return isPositive ? (int) result : (int) -result;
    }
}
