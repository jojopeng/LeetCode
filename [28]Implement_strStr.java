#28. Implement strStr()
#Implement strStr().

#Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

#Example 1:

#Input: haystack = "hello", needle = "ll"
#Output: 2

# method 1
class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
              if (j == needle.length()) return i;
              if (i + j == haystack.length()) return -1;
              if (needle.charAt(j) != haystack.charAt(i + j)) break;
            }
          }
    }
}


#method 2
class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        if(needle.length()>haystack.length()) return -1;
        if(needle.length()==haystack.length()&&needle.equals(haystack)) return 0;
        for(int i=0;i<=haystack.length()-needle.length();i++){    //注意边界等于的细节
            if(haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
}
