class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int pos = 0;
        for(int num: nums){
            if(num < pivot)
                result[pos++] = num;
        }

        for(int num: nums){
            if(num == pivot)
                result[pos++] = num;
        }

        for(int num: nums){
            if(num > pivot)
                result[pos++] = num;
        }
        return result;
    }
}