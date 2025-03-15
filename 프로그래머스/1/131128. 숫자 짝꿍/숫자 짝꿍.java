import java.lang.Math.*;
import java.util.Arrays;

class Solution {
    public String solution(String X, String Y) {
        int[] x = new int[10];
        int[] y = new int[10];
        Arrays.fill(x, 0);
        Arrays.fill(y, 0);
        StringBuilder sb = new StringBuilder();
        
        for (char a : X.toCharArray()) {
            x[Character.getNumericValue(a)] += 1;
        }
        for (char b : Y.toCharArray()) {
            y[Character.getNumericValue(b)] += 1;
        }
        
        for (int i = 9; i >= 0; i--) {
            int multiple = Math.min(x[i], y[i]);
            sb.append(String.valueOf(i).repeat(multiple));
        }
        if (sb.toString().length() == 0) {
            return "-1";
        }
        if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}