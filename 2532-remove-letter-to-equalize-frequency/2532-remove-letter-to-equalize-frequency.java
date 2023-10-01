class Solution {
    public boolean validCheck(int[] map){
        int lastVal = 0;
        for(int count : map){
            if(count > 0){
                if(lastVal == 0) lastVal = count;
                if(count != lastVal) return false;
            }
        }

        return true;
    }

    public boolean equalFrequency(String word) {
        int[] map = new int[26];

        for(int i=0; i<word.length(); i++){
            map[word.charAt(i) - 'a']++;
        }

        for(int i=0; i<word.length(); i++){
            map[word.charAt(i) - 'a']--;
            if(validCheck(map)) 
                return true;

            map[word.charAt(i) - 'a']++;
        }

        return false;
    }
}