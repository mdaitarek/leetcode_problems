class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int item: candyType) {
            set.add(item);
            if(set.size() > (candyType.length/2)) return (candyType.length/2);
        }
        // System.out.println(set);
        return set.size();
    }
}