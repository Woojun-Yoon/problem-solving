class Solution {
    public String solution(String s, int n) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for (char c : ch) {
            int check = c + n;
            char t = ' ';
            if ('a' <= c && c <= 'z') {
                if (check > 'z') {
                    check -= 26;
                }
                t = (char) check;
                sb.append(t);
            } else if ('A' <= c && c <= 'Z') {
                if (check > 'Z') {
                    check -= 26;
                }
                t = (char) check;
                sb.append(t);
            } else {
                sb.append(t);
            }
        }

        return sb.toString();
    }
}