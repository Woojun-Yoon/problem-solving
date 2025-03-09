import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int result = 0;
        int[] w = new int[n];
        Arrays.fill(w, 1);
        for (int i : section) {
            w[i - 1] = 0;
        }
        // 다시 칠할 필요가 없는 벽 => 1
        // 다시 칠해야하는 벽 => 0
        for (int i = 0; i < n; i++) {
            if (w[i] == 0) {
                for (int j = 0; j < m; j++) {
                    if (i + j >= n) {
                        break;
                    }
                    w[i + j] = 1;
                }
                result++;
            }
        }
        return result;
    }
}