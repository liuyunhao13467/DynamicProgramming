package com;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
        int len = nums.length;
        int curSum = nums[0];
        int maxSum = curSum;
        for(int i = 1; i < len; ++i){
        	curSum = nums[i] > (nums[i] + curSum) ? nums[i] : (nums[i] + curSum);
        	maxSum = maxSum > curSum ? maxSum : curSum;
        }
        return maxSum;
    }
}
