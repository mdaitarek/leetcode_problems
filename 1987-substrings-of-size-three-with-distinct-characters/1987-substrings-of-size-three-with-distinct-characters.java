class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        if(n<3) return 0;
        int[] map = new int[26];
        int total = 0, count = 0;
        for(int i=0; i<3; i++){
            if(++map[s.charAt(i) - 'a']> 1)
                ++count;
        }

        if(count==0) total++;

        for(int i=3; i<n; i++){
            --map[s.charAt(i-3) - 'a'];
            ++map[s.charAt(i) - 'a'];
            if(
                map[s.charAt(i-2) - 'a'] > 1 || 
                map[s.charAt(i-1) - 'a'] > 1 || 
                map[s.charAt(i) - 'a'] > 1
            ) continue;

            total++; 
        }

        return total;
    }
}