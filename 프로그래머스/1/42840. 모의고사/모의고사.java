import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] result = {0, 0, 0};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % 5]) {
                result[0] += 1;
            }
            if (answers[i] == b[i % 8]) {
                result[1] += 1;
            }
            if (answers[i] == c[i % 10]) {
                result[2] += 1;
            }
        }
        
        int max = 0;
        for (int n : result) {
            if (max < n) {
                max = n;
            }
        }
        
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (result[i] == max) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}