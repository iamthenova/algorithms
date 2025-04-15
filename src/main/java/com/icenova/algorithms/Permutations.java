package com.icenova.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        var result = new ArrayList<List<Integer>>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    private void backtrack(ArrayList<List<Integer>> result, ArrayList<Integer> permutation, int[] nums) {
        if (permutation.size() == nums.length) {
            result.add(List.copyOf(permutation));
            return;
        }

        for (int num : nums) {
            if (permutation.contains(num)) {
                continue;
            }

            permutation.add(num);
            backtrack(result, permutation, nums);
            permutation.removeLast();
        }
    }
}
