import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int dLen = d.length;
        Arrays.sort(d);
        int result = 0;

        for (int money : d) {
            if (money > budget) {
                break;
            }
            budget -= money;
            result++;
        }
        return result;
    }
}