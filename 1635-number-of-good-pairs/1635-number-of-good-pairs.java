class Solution {
    public int numIdenticalPairs(int[] nums) {
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      for(int i=0; i<nums.length; i++){
        int count = map.getOrDefault(nums[i], 0);
        map.put(nums[i], ++count);
      }
      int pairs = 0;
      for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        int count = entry.getValue();
        if(count > 1) pairs+= ((count*(count-1))/2);
      }
      return pairs;
    }
}