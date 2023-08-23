class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = 0, distance = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j=i+1, k=nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(target - sum) < distance){
                    distance = Math.abs(target - sum);
                    closest = sum;
                    // j++; k--;
                } else if(sum == target) {
                    return sum;
                } else if(sum<target) {
                    j++;
                } else {
                    k--;
                }
            }    
        }
        return closest;
    }
}