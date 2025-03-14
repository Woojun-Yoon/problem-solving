import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        List<String> alphabets = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            boolean flag = true;
            for (char c : skip.toCharArray()) {
                if (i == c) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                alphabets.add(Character.toString(i));
            }
        }

        char[] check = s.toCharArray();
        for (char c : check) {
            int i = alphabets.indexOf(Character.toString(c));
            i += index;
            while (true) {
                if (i >= alphabets.size()) {
                    i -= alphabets.size();
                } else {
                    break;
                }
            }
            answer += alphabets.get(i);
        }
        
        return answer;
    }
}