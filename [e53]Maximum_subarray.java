/*53. Maximum Subarray
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
*/

# 这里的题目只要求出最大的值，不需要给出值为最大时的子序列

class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int res = nums[0];
        for(int i = 1; i < nums.length; i ++){
            max = Math.max(nums[i] , max + nums[i]);
            res = Math.max(res , max);
        }
        return res;
    }
}

//需要给出子序列的题目的解如下
