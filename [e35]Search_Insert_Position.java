#35. Search Insert Position
#Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

#You may assume no duplicates in the array.

#Input: [1,3,5,6], 5
#Output: 2
#


class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, 0, nums.length, target);
        return index >= 0?index:-index - 1;
    }
}
