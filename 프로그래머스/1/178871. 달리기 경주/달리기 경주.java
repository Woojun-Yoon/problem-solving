import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        int len = players.length;
        for (int i = 0; i < len; i++) {
            map.put(players[i], i);
        }
        
        for (String call : callings) {
            // 불린 선수 랭킹
            int callLank = map.get(call);
            // 불린 선수 앞사람 이름
            String fronter = players[callLank - 1];
            // 앞사람 등수를 맵애서 낮춤
            map.replace(fronter, callLank);
            // 불린 선수 등수를 맵에서 올림
            map.replace(call, callLank - 1);
            // 원본 배열 수정
            players[callLank - 1] = call;
            players[callLank] = fronter;
        }
        
        return players;
    }
}