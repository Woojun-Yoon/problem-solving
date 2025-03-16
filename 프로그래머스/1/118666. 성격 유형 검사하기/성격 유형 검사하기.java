import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>(Map.of(
            'R', 0,
            'T', 0,
            'C', 0,
            'F', 0,
            'J', 0,
            'M', 0,
            'A', 0,
            'N', 0
        ));
        
        for (int i = 0; i < survey.length; i++) {
            char[] check = survey[i].toCharArray();
            Character left = check[0];
            Character right = check[1];
            int choice = choices[i];
            if (choice < 4) {
                map.put(left, map.get(left) + 4 - choice);
            } else if (choice > 4) {
                map.put(right, map.get(right) - 4 + choice);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (map.get('R') >= map.get('T')) {
            sb.append('R');
        } else {
            sb.append('T');
        }
        if (map.get('C') >= map.get('F')) {
            sb.append('C');
        } else {
            sb.append('F');
        }
        if (map.get('J') >= map.get('M')) {
            sb.append('J');
        } else {
            sb.append('M');
        }
        if (map.get('A') >= map.get('N')) {
            sb.append('A');
        } else {
            sb.append('N');
        }
        
        return sb.toString();
    }
}