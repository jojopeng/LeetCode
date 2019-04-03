#217. Contains Duplicate
#
#Given an array of integers, find if the array contains any duplicates.
#Your function should return true if any value appears at least twice in the array, 
#and it should return false if every element is distinct.

#Input: [1,2,3,1]
#Output: true

#sorting
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}

#Hash Table
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for(int x: nums){
            if(set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}
