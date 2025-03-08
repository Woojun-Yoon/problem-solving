import java.util.*;

class Solution {
    public int solution(int a, int b, int n) {
        int result = 0;
        int tmp = n;
        while (tmp != 0) {
            int sell = tmp / a * a;
            if (sell == 0) {
                break;
            }
            int get = tmp / a * b;
            result += get;
            tmp = tmp - sell + get;
        }
        return result;
    }
}