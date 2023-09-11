class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder str = new StringBuilder();
        for(int i=0; i<k; i++){
            if(i<arr.length)
                str.append(arr[i] + " ");
        }
        return str.toString().trim();
    }
}