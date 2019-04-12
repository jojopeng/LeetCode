/*
66. Plus One
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i] ++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[len+1];
        res[0] = 1;
        return res;
    }
}


####python
class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        nums = ''.join(str(num) for num in digits)
        return map(int, str(int(nums)+1))
