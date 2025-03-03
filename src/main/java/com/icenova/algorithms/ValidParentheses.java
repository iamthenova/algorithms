package com.icenova.algorithms;

import java.util.ArrayDeque;

public class ValidParentheses {

    //Example 1:
    //Input: s = "()"
    //Output: true
    //
    //Example 2:
    //Input: s = "()[]{}"
    //Output: true
    //
    //Example 3:
    //Input: s = "(]"
    //Output: false
    //
    //Example 4:
    //Input: s = "([])"
    //Output: true

    //queue: [(
    public boolean isValid(String s) {
        var queue = new ArrayDeque<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                queue.addFirst(c);
            } else {
                if (queue.isEmpty()) {
                    return false;
                }

                char top = queue.pollFirst();
                if (c == ')' && top != '(' || c == ']' && top != '[' || c == '}' && top != '{') {
                    return false;
                }
            }
        }

        if (!queue.isEmpty()) {
            return false;
        }

        return true;
    }
}
