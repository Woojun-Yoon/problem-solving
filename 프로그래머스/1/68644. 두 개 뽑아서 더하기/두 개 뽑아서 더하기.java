import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        int len = numbers.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted(Comparator.naturalOrder()).mapToInt(i -> i).toArray();
    }
}