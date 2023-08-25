class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for(int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        for(int key : map.keySet()){
            if(map.containsKey(key+1)){
                max = Math.max(max, map.get(key)+map.get(key+1));
            }
        }
        return max;
    }
}