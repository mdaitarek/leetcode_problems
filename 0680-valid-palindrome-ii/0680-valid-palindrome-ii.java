class Solution {
    public boolean isPallindrome(String s, int left, int right, int count){
        if(count>1) return false;
        while(left<right) {
            if(s.charAt(left) == s.charAt(right)){
                left++; right--;
            }
            else {
                count++;
                return isPallindrome(s, left+1, right, count) || isPallindrome(s, left, right-1, count);
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        return isPallindrome(s, 0, s.length()-1, 0);
    }
}