/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
*/

class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string> res;
        check("",res,n,0,0);
        return res;
    }
    
    void check(string cur,vector<string> &res,int n,int left,int right){
        if(right == n){
            res.push_back(cur);
        }
        if(left < n){
            check(cur+"(",res,n,left+1,right);
        }
        if(right < left)
        {
            check(cur+")",res,n,left,right+1);   
        }
    }
};
