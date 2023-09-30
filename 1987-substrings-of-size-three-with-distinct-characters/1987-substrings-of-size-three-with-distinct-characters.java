class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.size() != 3) {
                while (!set.add(s.charAt(i))) {
                    set.remove(set.iterator().next());
                }
            }
            else {
                count++;
                set.remove(set.iterator().next());
                while (!set.add(s.charAt(i))) {
                    set.remove(set.iterator().next());
                }
            }
        }
        if (set.size() == 3) {
            count++;
        }
        return count;
    }
}