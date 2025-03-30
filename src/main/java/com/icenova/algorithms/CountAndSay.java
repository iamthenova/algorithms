package com.icenova.algorithms;

public class CountAndSay {

    public String countAndSay(int n) {
        var current = "1";

        for (int i = 1; i < n; i++) {
            var nextTerm = new StringBuilder();
            var count = 1;

            for (int j = 1; j <= current.length(); j++) {
                if (j < current.length() && current.charAt(j) == current.charAt(j - 1)) {
                    count++;
                } else {
                    nextTerm.append(count);
                    nextTerm.append(current.charAt(j - 1));
                    count = 1;
                }
            }

            current = nextTerm.toString();
        }

        return current;
    }
}
