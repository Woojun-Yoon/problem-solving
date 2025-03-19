import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> giftKospi = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();
        for (String friend : friends) {
            giftKospi.put(friend, 0);
            result.put(friend, 0);
        }
        // 선물 지수 구하기
        for (String gift : gifts) {
            String[] g = gift.split(" ");
            giftKospi.replace(g[0], giftKospi.get(g[0]) + 1);
            giftKospi.replace(g[1], giftKospi.get(g[1]) - 1);
        }
        
        // 선물 주고받은 개수 초기화
        Map<String, Integer> change = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                change.put(friends[i] + "," + friends[j], 0);
            }
        }
        for (String gift : gifts) {
            String[] g = gift.split(" ");
            String one = g[0] + "," + g[1];
            String two = g[1] + "," + g[0];
            if (change.containsKey(one)) {
                change.replace(one, change.get(one) + 1);
            } else {
                change.replace(two, change.get(two) - 1);
            }
        }
        
        // 선물 주고받은 개수 계산
        for (String key : change.keySet()) {
            String[] cache = key.split(",");
            String one = cache[0];
            String two = cache[1];
            if (change.get(key) > 0) {
                result.replace(one, result.get(one) + 1);
            } else if (change.get(key) < 0) {
                result.replace(two, result.get(two) + 1);
            } else {
                int oneKospi = giftKospi.get(one);
                int twoKospi = giftKospi.get(two);
                if (oneKospi > twoKospi) {
                    result.replace(one, result.get(one) + 1);
                }
                if (oneKospi < twoKospi) {
                    result.replace(two, result.get(two) + 1);
                }
            }
        }
        
        int answer = 0;
        for (int v : result.values()) {
            if (v > answer) {
                answer = v;
            }
        }
        return answer;
    }
}