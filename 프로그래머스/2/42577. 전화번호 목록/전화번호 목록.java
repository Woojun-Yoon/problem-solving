import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int len = phone_book.length;
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < len; i++) {
            map.put(phone_book[i], i);
        }
        
        for (int i = 0; i < len; i++) {
            String num = phone_book[i];
            for (int j = 1; j < num.length(); j++) {
                if (map.containsKey(num.substring(0, j))) {
                    return false;
                }
            }
        }
        
        
        return answer;
    }
}