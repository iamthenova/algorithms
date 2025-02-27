package com.icenova.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThreeSumClosestTest {

    private ThreeSumClosest threeSumClosest;

    @BeforeEach
    void setUp() {
        threeSumClosest = new ThreeSumClosest();
    }

    @Test
    void testExample1() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = threeSumClosest.threeSumClosest(nums, target);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void testExample2() {
        int[] nums = {0, 0, 0};
        int target = 1;
        int result = threeSumClosest.threeSumClosest(nums, target);
        assertThat(result).isZero();
    }

    @Test
    void testExactMatch() {
        int[] nums = {1, 1, 1, 0};
        int target = 3;
        int result = threeSumClosest.threeSumClosest(nums, target);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void testMixedNumbers() {
        int[] nums = {-10, -5, 0, 5, 10};
        int target = 6;
        int result = threeSumClosest.threeSumClosest(nums, target);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void testLargeNumbers() {
        int[] nums = {1000, 2000, 3000, 4000, 5000};
        int target = 12345;
        int result = threeSumClosest.threeSumClosest(nums, target);
        assertThat(result).isEqualTo(12000);
    }

    @Test
    void testMinimumInputSize() {
        int[] nums = {1, 2, 3};
        int target = 100;
        int result = threeSumClosest.threeSumClosest(nums, target);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void testAllSameNumbers() {
        int[] nums = {5, 5, 5, 5, 5};
        int target = 14;
        int result = threeSumClosest.threeSumClosest(nums, target);
        assertThat(result).isEqualTo(15);
    }
}