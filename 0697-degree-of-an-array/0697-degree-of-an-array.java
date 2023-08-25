class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        HashMap <Integer, Integer> numIdxF = new HashMap<>();
        HashMap <Integer, Integer> numIdxL = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(!numIdxF.containsKey(nums[i])) numIdxF.put(nums[i], i);
            numIdxL.put(nums[i], i);
        };
        int max = 0, res = Integer.MAX_VALUE;
        for(int key : map.keySet()){
            int temp = map.get(key);
            if(temp == max){
                int len = numIdxL.get(key) - numIdxF.get(key) + 1;
                if(res > len) res = len;
            } else if(temp > max){
                int len = numIdxL.get(key) - numIdxF.get(key) + 1;
                max = temp;
                res = len;
            }
        }
        return res;
    }
}