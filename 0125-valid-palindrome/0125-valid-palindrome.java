class Solution {
    /**
        My Solution
     */
    // public boolean isCharOrDigit(char ch) {
    //     return (48 <= ch && ch <= 57) 
    //     || (65 <= ch && ch <= 90) 
    //     || (97 <= ch && ch <= 122);
    // }

    // public boolean isPalindrome(String s) {
    //      if (s.isEmpty()) {
    //         return true;
    //     }
    //     int i=0, j=s.length()-1;
    //     while(i<=j){
    //         if(!isCharOrDigit(s.charAt(i))) i++;
    //         else if(!isCharOrDigit(s.charAt(j))) j--;
    //         else if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
    //         else {
    //             i++; j--;
    //         }
    //     }
    //     return true;
    // }
    
    /**
        Best Solution
    */

    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int left=0, right=s.length() -1;
        
        while(left<=right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)) left++;
            else if(!Character.isLetterOrDigit(rightChar)) right--;
            else if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) return false;
            else {
                left++; 
                right--;
            }
        }
        return true;
    }
}