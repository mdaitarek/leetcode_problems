class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      int[] result = new int[nums.length];

      for(int i=0; i<nums.length; i++)
        result[i] = nums[i];
              
      Arrays.sort(result);
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      for(int i=0; i<result.length; i++){
        if(!map.containsKey(result[i])) map.put(result[i], i);
      }
      
      // System.out.println(map);

      for(int i=0; i<result.length; i++){
        result[i] = map.get(nums[i]);
      }
      return result;
    }
}