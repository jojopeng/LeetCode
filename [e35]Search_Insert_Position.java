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

#参数：
#a - 要搜索的数组
#fromIndex - 要搜索的第一个元素的索引（包括）
#toIndex - 要搜索的最后一个元素的索引（不包括）
#key - 要搜索的值

#返回：
/*如果它包含在数组的指定范围内，则返回搜索键的索引；否则返回 (-(插入点) - 1)。 
插入点 被定义为将键插入数组的那一点：即范围中第一个大于此键的元素索引，如果范围中的所有元素都小于指定的键，则为 toIndex。
注意，这保证了当且仅当此键被找到时，返回的值将 >= 0。
*/
