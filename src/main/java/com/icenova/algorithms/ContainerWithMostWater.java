package com.icenova.algorithms;

public class ContainerWithMostWater {

    //Example 1:
    //Input: height = [1,8,6,2,5,4,8,3,7]
    //Output: 49
    //Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
    //
    //Example 2:
    //Input: height = [1,1]
    //Output: 1
    //
    //Example 3:
    //Input: height = [3, 1, 2, 1, 13, 6, 2, 3, 4]
    //Output: 1
    public int maxArea(int[] height) {
        var maxArea = 0;
        var left = 0;
        var right = height.length - 1;

        while (left < right) {
            var width = right - left;
            var area = Math.min(height[left], height[right]) * width;

            if (area > maxArea) {
                maxArea = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
