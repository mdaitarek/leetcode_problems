class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int max=0, l=0, r=1,n=nums.length;
        while(r<n){
            int diff = nums[r] - nums[l];
            if(diff == 1){
                max = Math.max(max, (r-l+1));
            }
            if(diff <= 1) r++;
            else {
                l++; 
                r=l+1;
            }
        }
        return max;
    }
}