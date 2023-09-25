class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] map = new int[26];
        List<Integer> labels = new ArrayList<>();
        int start = 0, end = 0, endIndex = 0;

        for(int i=0; i<s.length(); i++){
           map[s.charAt(i) - 'a'] = i;
        }
        while(end < s.length()){
            endIndex = Math.max(map[s.charAt(end) - 'a'], endIndex);
            if(endIndex == end){
                labels.add((end - start + 1));
                start = end + 1;
            }
            end++;              
        }
        return labels;                
    }
}