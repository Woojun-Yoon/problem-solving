import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        int len = citations.length;
        Arrays.sort(citations);
        System.out.println(Arrays.toString(citations));
        
        for (int i = 0; i < len; i++) {
            int h = len - i;
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}