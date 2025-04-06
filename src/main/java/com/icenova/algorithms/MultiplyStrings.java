package com.icenova.algorithms;

public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        var len1 = num1.length();
        var len2 = num2.length();

        var res = new int[len1 + len2];

        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                var mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                var sum = mul + res[i + j + 1];
                res[i + j] += sum / 10;
                res[i + j + 1] = sum % 10;
            }
        }

        var result = new StringBuilder();
        for (int digit : res) {
            if (!(result.isEmpty() && digit == 0)) {
                result.append(digit);
            }
        }

        return result.toString();
    }
}

