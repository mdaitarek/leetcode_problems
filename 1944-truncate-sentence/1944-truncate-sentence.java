class Solution {
    public String truncateSentence(String s, int k) {
        String str = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') k--;
            if(k == 0) break;
            str += s.charAt(i);
        }
        return str;
    }
}