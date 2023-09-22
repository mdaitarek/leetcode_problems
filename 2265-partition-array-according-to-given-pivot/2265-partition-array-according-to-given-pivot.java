class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int j = 0;

        for(int num : nums)
            if(num < pivot)
                ans[j++] = num;

        for(int num : nums)
            if(num == pivot)
                ans[j++] = num;

        for(int num : nums)
            if(num > pivot)
                ans[j++] = num;

        return ans;
    }
}