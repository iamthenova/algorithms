package com.icenova.algorithms;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        var result = new ArrayList<String>();
        backtrack("", 0, 0, result, n);

        return result;
    }

    private void backtrack(String s, int left, int right, List<String> result, int n) {
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }

        if (left < n) {
            backtrack(s + "(", left + 1, right, result, n);
        }

        if (right < left) {
            backtrack(s + ")", left, right + 1, result, n);
        }
    }
}
