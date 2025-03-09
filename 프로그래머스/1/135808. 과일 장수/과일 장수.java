import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        List<Integer> s = Arrays.stream(score).boxed().collect(Collectors.toList());
        s.sort(Comparator.reverseOrder());
        int result = 0;
        int count = 0;
        int min = k;
        
        for (int n : s) {
            if (k > n) {
                min = n;
            }
            count++;
            
            if (count == m) {
                result += min * count;
                count = 0;
                min = k;
            }
        }
        
        return result;
    }
}