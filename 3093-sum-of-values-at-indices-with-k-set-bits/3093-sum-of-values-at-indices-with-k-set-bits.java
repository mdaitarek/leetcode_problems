class Solution {
    public boolean vaildIndex(int index, int k){
        int count = 0;
        while(index >0){
            if(index%2 == 1) count++;
            if(count > k) return false;
            index/=2;
        }

        return count == k;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i=0; i<nums.size(); i++){
            if(vaildIndex(i,k)) sum+=nums.get(i);
        }

        return sum;
    }
}