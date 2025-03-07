import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(long n) {
        List<Integer> numbers = new ArrayList<>();

        while (n != 0) {
            numbers.add(Long.valueOf(n % 10).intValue());
            n = n / 10;
        }
        
        int[] answer = numbers.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}