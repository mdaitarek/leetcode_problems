class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int max = 0;
        for(int count : candies)
            max = Math.max(max, count);
        
        for(int count : candies)
            list.add(count+extraCandies >= max);

        return list;
    }
}