import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        for (String number : num.split("")) {
            answer += Integer.parseInt(number);
        }
        return answer;
    }
}