package com.icenova.algorithms;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int breakPoint = -1;
        int smallestFromRight = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakPoint = i;
                break;
            }
        }

        if (breakPoint == -1) {
            reverse(nums, 0);
        } else {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[breakPoint]) {
                    smallestFromRight = i;
                    break;
                }
            }

            swap(nums, breakPoint, smallestFromRight);
            reverse(nums, breakPoint + 1);
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
