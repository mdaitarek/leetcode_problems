class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> smaller = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        List<Integer> piv = new ArrayList<>();
        for(int num: nums){
            if(num > pivot)
                greater.add(num);
            else if(num < pivot)
                smaller.add(num);
            else 
                piv.add(num);
        }
        int[] result = new int[nums.length];
        int pos = 0;
        for(Integer num : smaller)
            result[pos++] = num;
        for(Integer num : piv)
            result[pos++] = num;
        for(Integer num : greater)
            result[pos++] = num;

        return result;
    }
}