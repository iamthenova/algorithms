package com.icenova.algorithms;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    //haystack = "sadbutsad", needle = "sad"
    public int strStr(String haystack, String needle) {
        var charArray = needle.toCharArray();
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == charArray[0]) {
                var nextIndex = i;
                var j = 0;
                for (; j < charArray.length && nextIndex < haystack.length(); j++, nextIndex++) {
                    if (haystack.charAt(nextIndex) != charArray[j]) {
                        break;
                    }
                }

                if (j == charArray.length) {
                    return i;
                }
            }
        }

        return -1;
    }
}
