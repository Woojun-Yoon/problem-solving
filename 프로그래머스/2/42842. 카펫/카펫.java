import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        List<Integer> hList = new ArrayList<>();
        int all = brown + yellow;
        // 가능한 가로 길이 찾기
        for (int i = 3; i * i <= all; i++) {
            if (all % i == 0) {
                hList.add(i);
            }
        }
        System.out.println(hList);
        for (Integer h : hList) {
            int w = all / h;
            if ((h - 2) * (w - 2) == yellow) {
                answer[0] = w;
                answer[1] = h;
                break;
            }
        }
        
        
        return answer;
    }
}