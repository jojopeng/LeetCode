/*
202. Happy Number
Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 

Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/

class Solution {
    public boolean isHappy(int n) {
        int x = n;
        int y = n;
        while(x>1){
            x = cal(x);
            if(x == 1) return true;
            y = cal(cal(y));
            if(y == 1) return true;
            
            if(x == y) return false;
        }
        return true;
    }
    
    public int cal(int n){
        int x = n;
        int sum = 0;
        while(x > 0){
            sum = sum + (x%10)*(x%10);
            x = x/10;
        }
        return sum;
    }
}
