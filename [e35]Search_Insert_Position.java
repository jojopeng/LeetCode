#35. Search Insert Position
#Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

#You may assume no duplicates in the array.

#Input: [1,3,5,6], 5
#Output: 2
#二分查找


class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, 0, nums.length, target);
        return index >= 0?index:-index - 1;
    }
}

#注 JAVA JDK 的源码
 // Like public version, but without range checks.
    private static int binarySearch0(int[] a, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }


