class Solution {
    public int noOfBits(int index){
        int count = 0;
        while(index >0){
            if(index%2 == 1) count++;
            index/=2;
        }

        return count;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for(int i=0; i<nums.size(); i++){
            if(noOfBits(i) == k) sum+=nums.get(i);
        }

        return sum;
    }
}