class Solution {
    public String reversePrefix(String word, char ch) {
        int start = 0, end = 0;
        StringBuilder reverse = new StringBuilder(word);
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch){
                end = i;
                break;
            }
        }
        while(start<end){
            char temp = reverse.charAt(end);
            reverse.setCharAt(end, reverse.charAt(start));
            reverse.setCharAt(start, temp);
            start++;
            end--;
        }

        return reverse.toString();
    }
}