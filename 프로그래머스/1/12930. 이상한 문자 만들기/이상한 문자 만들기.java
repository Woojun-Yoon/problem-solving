import java.util.*;

class Solution {
    public String solution(String s) {        
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        int i = 0;
        boolean check = true;
        for (char c : ch) {
            if (c == ' ') {
                i = 0;
                check = true;
                sb.append(' ');
                continue;
            }
            if (check) {
                sb.append(Character.toUpperCase(c));
                check = false;
            } else {
                sb.append(Character.toLowerCase(c));
                check = true;
            }
        }
        return sb.toString();
    }
}