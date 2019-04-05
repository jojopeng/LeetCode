#231. Power of Two
#关联：［e191］ 
#位运算的妙用
#Given an integer, write a function to determine if it is a power of two.
#Example 1:
#Input: 1
#Output: true 
#Explanation: 20 = 1
#思路：n&(n-1)可以消除掉最低位的1，那么2的幂二进制位中只有一个1，因此我们只需判断n&(n-1)==0即可。eg ： 2、4、8、16、32 （都是只包含一个 1）

class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
    }
}
