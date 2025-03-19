import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        int time = 0;
        
        for (int i = 0; i < attacks.length; i++) {
            System.out.println(answer);
            int attackTime = attacks[i][0];
            int damage = attacks[i][1];
            
            int healthTime = attackTime - time - 1;
            time = attackTime;
            // 체력 회복
            answer += (healthTime * x) + ((healthTime / t) * y);
            answer = (answer > health) ? health : answer;
            // 공격 받기
            answer -= damage;
            if (answer <= 0) {
                return -1;
            }
        }
        
        return answer;
    }
}