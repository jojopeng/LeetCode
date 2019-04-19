/*
198. House Robber
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

Example 1:

Input: [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
             Total amount you can rob = 1 + 3 = 4.
*/

/*DP*/

class Solution {
    public int rob(int[] nums) {
        int rob = 0;   //max monney can get if rob current house
        int notrob = 0; //max money can get if not rob current house
        for(int i=0; i<nums.length; i++) {
            int currob = notrob + nums[i]; //if rob current value, previous house must not be robbed
            notrob = Math.max(notrob, rob); 
            rob = currob;
        }
        return Math.max(rob, notrob);
    }
}


/*
public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[] dp = {nums[0], Math.max(nums[0], nums[1])};
        int index=0;
        for(int i=2; i<nums.length; i++){
            index = i&1; // i&1 === i%2.  //index^1: 0->1, 1->0.
        	dp[index] = Math.max(nums[i]+dp[index], dp[index^1]); 
        }
		return Math.max(dp[0], dp[1]);
	}

*/
