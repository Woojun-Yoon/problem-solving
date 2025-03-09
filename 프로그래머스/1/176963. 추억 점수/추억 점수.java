import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] result = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            String[] check = photo[i];
            for (String c : check) {
                if (map.containsKey(c)) {
                    sum += map.get(c);
                }
            }
            result[i] = sum;
        }
        return result;
    }
}