class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        String fullWord = word1 + word2;
        int len1 = word1.length(), len2 = word2.length(), i = 0;
        int n = Math.max(len1, len2);
        
        while(i < n){
            if(i<len1 && i<len2){
                str.append(word1.charAt(i));
                str.append(word2.charAt(i));
            } else if(i>=len1 && i<len2){
                str.append(word2.charAt(i));
            } else if(i<len1 && i>=len2){
                str.append(word1.charAt(i));
            }
            i++;
        }
        
        return str.toString();
    }
}