#191. Number of 1 Bits
#Write a function that takes an unsigned integer and return the number of '1' bits it has (also known as the Hamming weight).

#Input: 00000000000000000000000000001011
#Output: 3
#Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.

#类似位运算，参考［e231］

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int tmp = n;
        while(tmp!=0){
            tmp = tmp&(tmp-1);
            count++;
        }
        return count;
    }
}
