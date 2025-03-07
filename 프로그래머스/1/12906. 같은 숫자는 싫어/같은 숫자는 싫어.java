import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> result = new ArrayList<>();
        int check = -1;
        for (int num : arr) {
            if (check != num) {
                check = num;
                result.add(num);
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}