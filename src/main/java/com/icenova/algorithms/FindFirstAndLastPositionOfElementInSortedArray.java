package com.icenova.algorithms;

public class FindFirstAndLastPositionOfElementInSortedArray {

    //Example 1:
    //Input: nums = [5,7,7,8,8,10], target = 8
    //Output: [3,4]
    //
    //Example 2:
    //Input: nums = [5,7,7,8,8,10], target = 6
    //Output: [-1,-1]
    //
    //Example 3:
    //Input: nums = [], target = 0
    //Output: [-1,-1]
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        binarySearch(nums, target, 0, nums.length - 1, result);

        return result;
    }

    private void binarySearch(int[] nums, int target, int left, int right, int[] result) {
        if (left > right) {
            return;
        }

        var pivot = left + (right - left) / 2;

        if (nums[pivot] == target) {
            var tempPointer = pivot;

            while (pivot >= 1 && nums[pivot - 1] == target) {
                pivot--;
            }

            while (tempPointer <= nums.length - 2 && nums[tempPointer + 1] == target) {
                tempPointer++;
            }

            result[0] = pivot;
            result[1] = tempPointer;
        } else if (nums[pivot] < target) {
            binarySearch(nums, target, pivot + 1, right, result);
        } else {
            binarySearch(nums, target, left, pivot - 1, result);
        }
    }
}
