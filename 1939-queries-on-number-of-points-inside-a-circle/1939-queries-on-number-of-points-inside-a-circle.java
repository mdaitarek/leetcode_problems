class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] count = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            for(int j=0; j<points.length; j++){
                int diff_x = points[j][0] - queries[i][0];
                int diff_y = points[j][1] - queries[i][1];
                if((diff_x*diff_x) + (diff_y*diff_y) <= queries[i][2] * queries[i][2]) count[i]++;
            }
        }
        return count;
    }
}