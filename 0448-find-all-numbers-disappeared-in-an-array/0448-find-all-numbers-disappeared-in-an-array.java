class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int idx = nums[i];
            if(idx<0) idx*=-1;
            idx-=1;
            if(nums[idx] > 0) nums[idx]*=-1;
        }
        List<Integer> list=new ArrayList<Integer>();  
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0) list.add(i+1);
        } 
        return list;
    }
}