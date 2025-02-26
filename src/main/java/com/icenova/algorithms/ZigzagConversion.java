package com.icenova.algorithms;

public class ZigzagConversion {

    //Example 1:
    //
    //Input: s = "PAYPALISHIRING", numRows = 3
    //Output: "PAHNAPLSIIGYIR"
    //Explanation:
    //P   A   H   N
    //A P L S I I G
    //Y   I   R
    //Example 2:
    //
    //Input: s = "PAYPALISHIRING", numRows = 4
    //Output: "PINALSIGYAHRPI"
    //Explanation:
    //P     I    N
    //A   L S  I G
    //Y A   H R
    //P     I
    //Example 3:
    //
    //Input: s = "A", numRows = 1
    //Output: "A"
    public String convert(String s, int numRows) {
            if (numRows == 1 || s.length() <= numRows) {
                return s;
            }

            // initialize string builder for each row
            var rows = new StringBuilder[numRows];
            for (int i = 0; i < rows.length; i++) {
                rows[i] = new StringBuilder();
            }

            var curRow = 0;
            var goingDown = false;

            for (char c : s.toCharArray()) {
                rows[curRow].append(c);

                if (curRow == 0 || curRow == numRows - 1) {
                    goingDown = !goingDown;
                }

                curRow += goingDown ? 1 : -1;
            }

            var result = new StringBuilder();
            for (StringBuilder row : rows) {
                result.append(row);
            }

            return result.toString();
        }
}
