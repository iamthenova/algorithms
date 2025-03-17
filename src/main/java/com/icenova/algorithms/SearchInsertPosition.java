package com.icenova.algorithms;

public class SearchInsertPosition {

    //Example 1:
    //Input: nums = [1,3,5,6], target = 5
    //Output: 2
    //
    //Example 2:
    //Input: nums = [1,3,5,6], target = 2
    //Output: 1
    //
    //Example 3:
    //Input: nums = [1,3,5,6], target = 7
    //Output: 4
    //
    //Example 4:
    //Input: nums = [1,3,5,6,10], target = 7
    //Output: 4
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] < target ? 1 : 0;
        }

        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int left, int right) {
        var pivot = left + (right - left) / 2;
        var currentPivotNum = nums[pivot];

        if (currentPivotNum == target) {
            while (pivot > 0 && nums[pivot - 1] == currentPivotNum) {
                pivot--;
            }

            return pivot;
        }

        var leftNum = nums[left];
        var rightNum = nums[right];

        if (right - left == 1) {
            if (leftNum < target && target <= rightNum) {
                return right;
            } else if (leftNum >= target) {
                return left;
            } else {
                return right + 1;
            }
        }

        if (currentPivotNum < target) {
            return binarySearch(nums, target, pivot, right);
        } else {
            return binarySearch(nums, target, left, pivot);
        }
    }
}
