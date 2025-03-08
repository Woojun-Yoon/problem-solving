import java.util.*;

class Solution {
    public int[] solution(String s) {
        char[] ch = s.toCharArray();
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < ch.length; i++) {
            int element = -1;
            int cache = ch[i];
            for (int j = i - 1; j >=0 ; j--) {
                if (cache == ch[j]) {
                    element = i - j;
                    break;
                }
            }
            result.add(element);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}