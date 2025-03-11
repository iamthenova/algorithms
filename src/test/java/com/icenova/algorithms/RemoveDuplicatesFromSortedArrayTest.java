package com.icenova.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray solution;

    @BeforeEach
    void setUp() {
        solution = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    void testSingleElementArray() {
        int[] nums = {1};
        int k = solution.removeDuplicates(nums);
        assertThat(k).isEqualTo(1);
        assertArrayEquals(new int[]{1}, getModifiedArray(nums, k));
    }

    @Test
    void testTwoElementsWithNoDuplicates() {
        int[] nums = {1, 2};
        int k = solution.removeDuplicates(nums);
        assertThat(k).isEqualTo(2);
        assertArrayEquals(new int[]{1, 2}, getModifiedArray(nums, k));
    }

    @Test
    void testTwoElementsWithDuplicates() {
        int[] nums = {1, 1};
        int k = solution.removeDuplicates(nums);
        assertThat(k).isEqualTo(1);
        assertArrayEquals(new int[]{1}, getModifiedArray(nums, k));
    }

    @Test
    void testExample1() {
        int[] nums = {1, 1, 2};
        int k = solution.removeDuplicates(nums);
        assertThat(k).isEqualTo(2);
        assertArrayEquals(new int[]{1, 2}, getModifiedArray(nums, k));
    }

    @Test
    void testExample2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = solution.removeDuplicates(nums);
        assertThat(k).isEqualTo(5);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, getModifiedArray(nums, k));
    }

    @Test
    void testAllDuplicates() {
        int[] nums = {2, 2, 2, 2, 2};
        int k = solution.removeDuplicates(nums);
        assertThat(k).isEqualTo(1);
        assertArrayEquals(new int[]{2}, getModifiedArray(nums, k));
    }

    @Test
    void testNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = solution.removeDuplicates(nums);
        assertThat(k).isEqualTo(5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, getModifiedArray(nums, k));
    }

    @Test
    void testNegativeNumbers() {
        int[] nums = {-3, -3, -2, -1, -1, 0, 0};
        int k = solution.removeDuplicates(nums);
        assertThat(k).isEqualTo(4);
        assertArrayEquals(new int[]{-3, -2, -1, 0}, getModifiedArray(nums, k));
    }

    // Helper method to get the first k elements of the modified array
    private int[] getModifiedArray(int[] nums, int k) {
        int[] result = new int[k];
        System.arraycopy(nums, 0, result, 0, k);
        return result;
    }
}