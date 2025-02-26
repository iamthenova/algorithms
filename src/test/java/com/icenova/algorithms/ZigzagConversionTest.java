package com.icenova.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZigzagConversionTest {

    @Test
    void testZigzagConversion() {
        ZigzagConversion converter = new ZigzagConversion();

        // Test case 1: Basic example
        String input1 = "PAYPALISHIRING";
        int numRows1 = 3;
        String expected1 = "PAHNAPLSIIGYIR";
        assertEquals(expected1, converter.convert(input1, numRows1));

        // Test case 2: Single row
        String input2 = "HELLO";
        int numRows2 = 1;
        String expected2 = "HELLO";
        assertEquals(expected2, converter.convert(input2, numRows2));

        // Test case 3: Number of rows greater than string length
        String input3 = "WORLD";
        int numRows3 = 10;
        String expected3 = "WORLD";
        assertEquals(expected3, converter.convert(input3, numRows3));

        // Test case 4: Two rows
        String input4 = "ABCDEFG";
        int numRows4 = 2;
        String expected4 = "ACEGBDF";
        assertEquals(expected4, converter.convert(input4, numRows4));
    }
}