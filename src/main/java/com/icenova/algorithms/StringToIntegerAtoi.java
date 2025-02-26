package com.icenova.algorithms;

import java.util.Set;

public class StringToIntegerAtoi {

    private static final Set<Character> DIGITS = Set.of('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');

    public int myAtoi(String s) {
        var trimmed = s.trim();
        var negative = false;
        var sb = new StringBuilder();

        if (trimmed.isEmpty()) {
            return 0;
        }

        if (trimmed.charAt(0) == '-') {
            negative = true;
            trimmed = trimmed.substring(1);
        } else if (trimmed.charAt(0) == '+') {
            trimmed = trimmed.substring(1);
        }

        var checkingLeadingZeroes = true;
        var shouldInterrupt = false;
        for (var c : trimmed.toCharArray()) {
            if (shouldInterrupt) {
                break;
            }

            if (c == '0' && checkingLeadingZeroes) {
                continue;
            }

            if (DIGITS.contains(c)) {
                checkingLeadingZeroes = false;
                sb.append(c);
            } else {
                checkingLeadingZeroes = false;
                shouldInterrupt = true;
            }
        }

        var result = sb.toString();
        if (result.isEmpty()) {
            return 0;
        }

        if (negative) {
            result = "-" + result;
        }

        try {
            return Integer.parseInt(result);
        } catch (NumberFormatException e) {
            if (negative) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }
}
