package com.loktar.leetcode.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */

public class Q1Solution {
    public int[] twoSumHash(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);

        for (int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for (int i=0; i<nums.length; i++){
            int n = target - nums[i];
            if (map.containsKey(n) &&  map.get(n) != i){
                return new int[]{i, map.get(n)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSumOneHash(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);

        for (int i=0; i<nums.length; i++){
            int n = target - nums[i];
            if (map.containsKey(n)){
               return new int[]{map.get(n), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
