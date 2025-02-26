package com.icenova.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeSumTest {

    private ThreeSum threeSum;

    @BeforeEach
    void setUp() {
        threeSum = new ThreeSum();
    }

    @Test
    void testExample1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertThat(result).hasSize(2)
                .contains(List.of(-1, -1, 2), List.of(-1, 0, 1));
    }

    @Test
    void testExample2() {
        int[] nums = {0, 1, 1};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertThat(result).isEmpty();
    }

    @Test
    void testExample3() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertThat(result).containsExactly(List.of(0, 0, 0));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertThat(result).isEmpty();
    }

    @Test
    void testArrayWithLessThanThreeElements() {
        int[] nums = {1, 2};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertThat(result).isEmpty();
    }

    @Test
    void testArrayWithAllPositiveNumbers() {
        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertThat(result).isEmpty();
    }

    @Test
    void testArrayWithAllNegativeNumbers() {
        int[] nums = {-5, -4, -3, -2, -1};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertThat(result).isEmpty();
    }

    @Test
    void testArrayWithDuplicates() {
        int[] nums = {-1, -1, 0, 1, 2, 2};
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertThat(result).hasSize(2)
                .contains(List.of(-1, -1, 2), List.of(-1, 0, 1));
    }

    @Test
    void testLargeArray() {
        int[] nums = new int[3000];
        for (int i = 0; i < 3000; i++) {
            nums[i] = i - 1500; // This will create an array from -1500 to 1499
        }
        List<List<Integer>> result = threeSum.threeSum(nums);
        assertThat(result).isNotEmpty(); // We expect some triplets to sum to zero
    }
}