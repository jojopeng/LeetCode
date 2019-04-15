/*
136. Single Number
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1

we have to know the bitwise XOR in java 异或
0 ^ N = N
N ^ N = 0
*/


class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        int len = nums.length;
        for(int i=0;i<len;i++){
            res =res ^ nums[i];
        }
        return res;
    }
}
