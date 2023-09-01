class Solution {
    public int balancedStringSplit(String s) {
        int chC=0, maxSub=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'R') chC++;
            else chC--;
            if(chC == 0) maxSub++;
        }

        return maxSub;
    }
}