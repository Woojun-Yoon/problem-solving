import java.lang.Math;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int cache = 0;
        char[] dart = dartResult.toCharArray();
        
        for (int i = 0; i < dart.length; i++) {
            int score = Character.getNumericValue(dart[i]);
            if (dart[i] == '1' && dart[i + 1] == '0') {
                score = 10;
                i++;
            }
            char bonus = dart[i + 1];
            
            if (bonus == 'D') {
                score = (int) Math.pow(score, 2);
            } else if (bonus == 'T') {
                score = (int) Math.pow(score, 3);
            }
            i++;
            
            if (i + 1 < dart.length) {
                if (dart[i + 1] == '*') {
                    score = score * 2;
                    answer += cache;
                    i += 1;
                } else if (dart[i + 1] == '#') {
                    score = score * -1;
                    i += 1;
                }
            }
            cache = score;
            answer += score;
        }
        
        return answer;
    }
}