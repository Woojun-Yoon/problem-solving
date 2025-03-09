import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder line = new StringBuilder();
            String a = Integer.toBinaryString(arr1[i]);
            String b = Integer.toBinaryString(arr2[i]);
            
            if (a.length() < n) {
                a = "0".repeat(n - a.length()) + a;
            }
            if (b.length() < n) {
                b = "0".repeat(n - b.length()) + b;
            }
            
            char[] c = a.toCharArray();
            char[] d = b.toCharArray();
            for (int j = 0; j < n; j++) {
                int x = Character.getNumericValue(c[j]);
                int y = Character.getNumericValue(d[j]);
                if ((x | y) == 1) {
                    line.append("#");
                } else {
                    line.append(" ");
                }
            }
            result[i] = line.toString();
        }
        return result;
    }
}