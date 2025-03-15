import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] cache = new int[26];
        Arrays.fill(cache, 0);
        
        for (int i = 0; i < 26; i++) {
            char check = (char) ((int) 'A' + i);
            int min = 200;
            for (String key : keymap) {
                char[] keyArray = key.toCharArray();
                for (int j = 0; j < keyArray.length; j++) {
                    if (keyArray[j] == check && min > j) {
                        min = j;
                    }
                }
            }
            min = (min == 200) ? -1 : min + 1; 
            cache[i] = min;
        }
        
        for (int i = 0; i < targets.length; i++) {
            char[] target = targets[i].toCharArray();
            int result = 0;
            for (char e : target) {
                int typing = cache[(int) (e - 'A')];
                if (result == -1 || typing == -1) {
                    result = -1;
                } else {
                    result += typing;
                }
            }
            answer[i] = result;
        }
        
        return answer;
    }
}