class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        List<Integer> labels = new ArrayList<>();
        int start = 0, end = 0, endIndex = 0;

        for(int i=0; i<s.length(); i++){
           map.put(s.charAt(i), i);
        }
        while(end < s.length()){
            int lastIndex = map.get(s.charAt(end));
            if(lastIndex > endIndex)
                endIndex = lastIndex;
            if(endIndex == end){
                labels.add((end - start + 1));
                start = end + 1;
            }
            end++;              
        }
        return labels;                
    }
}