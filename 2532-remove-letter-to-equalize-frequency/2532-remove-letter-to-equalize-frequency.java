class Solution {
    public boolean equalFrequency(String word) {
       int[] freq= new int[26];
        for(char c : word.toCharArray()) freq[c - 'a']++;
        
        for(char c : word.toCharArray()){
            freq[c - 'a']--; //as we have asked to delete exactly one char, so we will decrease freq by one for all
                             //chars and will check if after decreasing, the freqs of all chars are same or not, If
                             //not return false otherwise true;
            
            if(check(freq)){ // freqs are same no need to check further return true;
                return true;
            }
            freq[c - 'a']++; // we are here cause the earlier char freq is not same to other freqs. restore that char freq and check for next char.
        }
        return false;
    }
    
    public boolean check(int[] freq){
        int count = 0;
        
        for(int f : freq){
            if(f == 0) continue;
            else if(count == 0){
                count = f;
            }else if(count == f) continue;
            else return false;
        }
        
        return true;
    }
}