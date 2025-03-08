import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int tLen = t.length();
        int pLen = p.length();
        
        int result = 0;
        long pLong = Long.parseLong(p);
        for (int i = 0; i < tLen - pLen + 1; i++) {
            String check = t.substring(i, i + pLen);
            long checkLong = Long.parseLong(check);
            if (checkLong <= pLong) {
                result++;
            }
        }
        return result;
    }
}