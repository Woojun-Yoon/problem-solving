import java.lang.Math.*;
import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int result = 0;
        
        for (int i = 1; i <= number; i++) {
            int d = getDivisorCount(i);
            if (d > limit) {
                result += power;
            } else {
                result += d;
            }
        }
        return result;
    }
    
    private int getDivisorCount(int n) {
        int result = 0;
        for (int i = 1; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                if (i * i == n) {
                    result++;
                } else {
                    result += 2;
                }
            }
        }
        return result;
    }
}