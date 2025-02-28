package com.icenova.algorithms;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {

    private static final String[] buttons = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    //Example 1:
    //
    //Input: digits = "23"
    //Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    //
    //Example 2:
    //
    //Input: digits = ""
    //Output: []
    //
    //Example 3:
    //
    //Input: digits = "2"
    //Output: ["a","b","c"]
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return List.of();
        }

        var result = new ArrayList<String>();
        var pressedButtons = new ArrayList<String>();

        for (int i = 0; i < digits.length(); i++) {
            var digit = Character.getNumericValue(digits.charAt(i));
            var button = buttons[digit];

            pressedButtons.add(button);
        }

        rec(result, pressedButtons, new StringBuilder(), 0);

        return result;
    }

    private void rec(List<String> result, List<String> pressedButtons, StringBuilder sb, int level) {
        var currentButton = pressedButtons.get(level);
        for (var c : currentButton.toCharArray()) {
            sb.append(c);
            if (level == pressedButtons.size() - 1) {
                result.add(sb.toString());
            } else {
                rec(result, pressedButtons, sb, level + 1);
            }
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
