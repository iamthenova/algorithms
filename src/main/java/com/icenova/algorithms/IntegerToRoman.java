package com.icenova.algorithms;

public class IntegerToRoman {

    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        var sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            if (num == 0) {
                break;
            }

            var value = values[i];
            while (num >= value) {
                sb.append(symbols[i]);
                num -= value;
            }
        }

        return sb.toString();
    }
}
