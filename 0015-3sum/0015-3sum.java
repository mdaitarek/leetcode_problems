class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        HashSet<String> set = new HashSet<String>();
        int i=0;
        while(i<nums.length-1){
            int j = i+1,k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k] < 0){
                    j++;
                } else if(nums[i]+nums[j]+nums[k] > 0){
                    k--;
                } else {
                    String key = String.valueOf(nums[i])+String.valueOf(nums[j])+String.valueOf(nums[k]);
                    if(!set.contains(key)){
                        set.add(key);
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        arr.add(list);
                    }
                    j++; k--;
                }
            }
            i++;
        }
        return arr;
    }
}