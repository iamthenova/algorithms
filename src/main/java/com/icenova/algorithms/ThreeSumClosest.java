package com.icenova.algorithms;

import java.util.Arrays;

public class ThreeSumClosest {

    //Example 1:
    //
    //Input: nums = [-1,2,1,-4], target = 1
    //Output: 2
    //Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
    //
    //Example 2:
    //
    //Input: nums = [0,0,0], target = 1
    //Output: 0
    //Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

    //[-4,-1,1,2]
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // O(n log n)
        int closestSum = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum == target) {
                    return currentSum; // Exact match found
                }

                if (Math.abs(target - currentSum) < Math.abs(target - closestSum)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closestSum;
    }
}
