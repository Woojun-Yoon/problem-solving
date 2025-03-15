import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < lost.length; j++) {
                if (lost[j] == reserve[i]) {
                    answer++;
                    lost[j] = -1;
                    reserve[i] = -1;
                    break;
                }
            }
        }
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for (int give : reserve) {
            for (int i = 0; i < lost.length; i++) {
                if (lost[i] == give - 1 || lost[i] == give + 1) {
                    answer++;
                    lost[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}