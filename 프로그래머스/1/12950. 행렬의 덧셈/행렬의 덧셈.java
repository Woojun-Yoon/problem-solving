class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int xLen = arr1.length;
        
        for (int x = 0; x < xLen; x++) {
            int yLen = arr1[x].length;
            for (int y = 0; y < yLen; y++) {
                arr1[x][y] += arr2[x][y];
            }
        }
        return arr1;
    }
}