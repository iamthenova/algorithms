package com.icenova.algorithms;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        var split = s.split(" ");
        return split[split.length - 1].length();
    }
}
