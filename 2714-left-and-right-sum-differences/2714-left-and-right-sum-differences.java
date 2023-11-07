class Solution {
    public int[] findLeftPrefixSum(int[] nums, int n){
        int[] prefixSum = new int[n];
        prefixSum[0] = nums[0];
        for (int i = 1; i < n; ++i) 
            prefixSum[i] = prefixSum[i - 1] + nums[i];

        return prefixSum;
    }
    public int[] findRightPrefixSum(int[] nums, int n){
        int[] prefixSum = new int[n];
        prefixSum[n-1] = nums[n-1];
        for (int i = n-2; i >= 0; --i) 
            prefixSum[i] = prefixSum[i + 1] + nums[i];

        return prefixSum;
    }
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftPrefixSum = findLeftPrefixSum(nums, n);
        int[] rightPrefixSum = findRightPrefixSum(nums, n);
        int[] answer  = new int[n];

        for(int i=0; i<n; i++){
            answer[i] = Math.abs(leftPrefixSum[i] - rightPrefixSum[i]);
        }

        return answer;
    }
}