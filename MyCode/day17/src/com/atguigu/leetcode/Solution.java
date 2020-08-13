package com.atguigu.leetcode;

/**
 * @author Symon
 * @version 1.0
 * @className Solution
 * @description TODO
 * @date 2020/8/12 20:48
 */
public class Solution {
    public static void main(String[] args) {
        int[] ints = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(ints));
    }
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0)
                sum += num;
            else
                sum = num;
            res = Math.max(res, sum);
        }
        return res;
    }
}
