class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int count[] = new int[nums.length+1];
        List<List<Integer>> matrix = new ArrayList<>();

        for(int num: nums){
          if(matrix.size() < ++count[num])
            matrix.add(new ArrayList<>());
          matrix.get(count[num]-1).add(num);
        }
        return matrix;
    }
}