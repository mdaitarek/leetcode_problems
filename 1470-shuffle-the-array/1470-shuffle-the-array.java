class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = 2*n;
        int[] arr = new int[len];
        arr[0] = nums[0]; arr[len-1] = nums[len-1];
        int idx = 2;
        for(int i=1; i<len-1; i++){
            if(i==n) idx = 1;
            arr[idx] = nums[i];
            idx+=2;
        }
        return arr;
    }
}