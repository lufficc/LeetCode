package com.lufficc.leetcode.twosum;

/**
 * Created by lufficc on 2016/10/23.
 */
public class Main {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new RuntimeException("no result!!");
    }
}
