package com.icenova.algorithms;

import java.util.HashMap;

public class TwoSum {

    //Example 1:
    //
    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    //Example 2:
    //
    //Input: nums = [3,2,4], target = 6
    //Output: [1,2]
    //Example 3:
    //
    //Input: nums = [3,3], target = 6
    //Output: [0,1]
    // time: O(n) space: O(n) space
    public int[] twoSum(int[] nums, int target) {
        var numToIndex = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            var delta = target - nums[i];

            if (numToIndex.containsKey(delta)) {
                return new int[]{numToIndex.get(delta), i};
            }

            numToIndex.put(nums[i], i);
        }

        return null;
    }
}
