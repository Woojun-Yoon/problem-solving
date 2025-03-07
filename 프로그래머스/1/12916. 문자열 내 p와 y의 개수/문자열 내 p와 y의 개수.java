class Solution {
    boolean solution(String s) {
        String[] str = s.split("");
        int p = 0;
        int y = 0;
        for (String check : str) {
            if (check.equals("P") || check.equals("p")) {
                p += 1;
            } else if (check.equals("Y") || check.equals("y")) {
                y += 1;
            }
        }
        if (p == y) {
            return true;
        } else {
            return false;
        }
    }
}