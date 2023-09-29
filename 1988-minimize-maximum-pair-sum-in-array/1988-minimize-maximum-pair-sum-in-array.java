class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length-1, max = 0;
        while(left<right){
            max = Math.max(max, (nums[left]+nums[right]));
            left++; right--;
        }

        return max;
    }
}