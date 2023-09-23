class Solution {
    public int invert(int digit){
        return digit == 0 ? 1 : 0;
    }

    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            int left = 0, right = row.length-1;
            while(left<right){
                if(row[left] == row[right]){
                    row[left] = invert(row[left]);
                    row[right] = invert(row[right]);
                }
                right--;
                left++;
            }
            if(left == right)
                row[left] = invert(row[left]);
        }
        return image;
    }
}