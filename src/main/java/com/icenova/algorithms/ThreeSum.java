package com.icenova.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    //Example 1:
    //
    //Input: nums = [-1,0,1,2,-1,-4]
    //Output: [[-1,-1,2],[-1,0,1]]
    //Explanation:
    //nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    //nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    //nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    //The distinct triplets are [-1,0,1] and [-1,-1,2].
    //Notice that the order of the output and the order of the triplets does not matter.
    //
    //Example 2:
    //
    //Input: nums = [0,1,1]
    //Output: []
    //Explanation: The only possible triplet does not sum up to 0.
    //
    //Example 3:
    //
    //Input: nums = [0,0,0]
    //Output: [[0,0,0]]
    //Explanation: The only possible triplet sums up to 0.

    //Input: nums = [-1,0,1,2,-1,-4]
    //1 step: nums = [-4,-1,-1,0,1,2]
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //O(n log n)
        var currentIndex = 0;
        var result = new ArrayList<List<Integer>>();

        while (currentIndex < nums.length) {
            var current = nums[currentIndex];

            var leftPointer = currentIndex + 1;
            var rightPointer = nums.length - 1;
            while (leftPointer < rightPointer) {
                var leftNumber = nums[leftPointer];
                var rightNumber = nums[rightPointer];

                if (current + leftNumber + rightNumber == 0) {
                    result.add(List.of(current, leftNumber, rightNumber));
                    leftPointer = skipSimilarFromLeftToRight(leftPointer, nums);
                    rightPointer = skipSimilarFromRightToLeft(rightPointer, nums);
                } else if (current + leftNumber + rightNumber < 0) {
                    leftPointer = skipSimilarFromLeftToRight(leftPointer, nums);
                } else {
                    rightPointer = skipSimilarFromRightToLeft(rightPointer, nums);
                }
            }

            currentIndex = skipSimilarFromLeftToRight(currentIndex, nums);
        }

        return result;
    }

    private int skipSimilarFromLeftToRight(int pointer, int[] nums) {
        while (pointer < nums.length - 1 && nums[pointer] == nums[pointer + 1]) {
            pointer++;
        }

        return pointer + 1;
    }

    private int skipSimilarFromRightToLeft(int pointer, int[] nums) {
        while (pointer > 0 && nums[pointer] == nums[pointer - 1]) {
            pointer--;
        }

        return pointer - 1;
    }
}
