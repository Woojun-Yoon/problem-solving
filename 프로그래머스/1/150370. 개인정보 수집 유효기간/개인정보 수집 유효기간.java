import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> tm = new HashMap<>();
        
        String[] todayParse = today.split("\\.");
        int[] todayInt = Arrays.stream(todayParse).mapToInt(Integer::parseInt).toArray();
        
        
        for (String term : terms) {
            String[] arr = term.split(" ");
            tm.put(arr[0], Integer.valueOf(arr[1]));
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String[] arr = privacies[i].split(" ");
            int day = 28 * tm.get(arr[1]);
            
            String[] checkParse = arr[0].split("\\.");
            int[] checkInt = Arrays.stream(checkParse).mapToInt(Integer::parseInt).toArray();
            
            checkInt[0] += day / 336;
            day %= 336;
            checkInt[1] += day / 28;
            day %= 28;
            checkInt[2] += day;
            
            while (checkInt[1] > 12) {
                checkInt[1] -= 12;
                checkInt[0]++;
            }
            
            while (checkInt[2] > 28) {
                checkInt[2] -= 28;
                checkInt[1]++;
                while (checkInt[1] > 12) {
                    checkInt[1] -= 12;
                    checkInt[0]++;
                }
            }
            
            if (checkInt[0] < todayInt[0] ||
                (checkInt[0] == todayInt[0] && checkInt[1] < todayInt[1]) ||
                (checkInt[0] == todayInt[0] && checkInt[1] == todayInt[1] && checkInt[2] <= todayInt[2])) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}