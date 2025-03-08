class Solution {
    public int solution(int[][] sizes) {
        int cacheW = sizes[0][0];
        int cacheH = sizes[0][1];
        int result = cacheW * cacheH;

        for (int i = 1; i < sizes.length; i++) {
            int w = sizes[i][0];
            int h = sizes[i][1];
            if ((cacheW >= w && cacheH >= h) || (cacheW >= h && cacheH >= w)) {
                continue;
            }
            int a = (cacheW < w) ? w : cacheW;
            int b = (cacheH < h) ? h : cacheH;
            int c = (cacheW < h) ? h : cacheW;
            int d = (cacheH < w) ? w : cacheH;
            if (a * b > c * d) {
                cacheW = c;
                cacheH = d;
                result = c * d;
            } else {
                cacheW = a;
                cacheH = b;
                result = a * b;
            }
        }
    
        return result;
    }
}