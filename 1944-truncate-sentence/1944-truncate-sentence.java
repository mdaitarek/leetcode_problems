class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        int n = Math.min(k, arr.length);
        for(int i=0; i<n; i++){
            str.append(arr[i] + " ");
        }
        return str.toString().trim();
    }
}