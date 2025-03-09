import java.util.*;

class Solution {
    public String solution(int a, int b) {
        int day = 0;
        Map<Integer, String> map = Map.of(
            3, "SUN",
            4, "MON",
            5, "TUE",
            6, "WED",
            0, "THU",
            1, "FRI",
            2, "SAT"
        );
        
        for (int i = 1; i < a; i++) {
            if (i % 2 == 1) {
                if (i == 9 || i == 11) {
                    day += 30;
                } else {
                    day += 31;
                }
            } else {
                if (i == 2) {
                    day += 29;
                } else if (i == 8 || i == 10 || i == 12) {
                    day += 31;
                }
                else {
                    day += 30;
                }
            }
        }
        day += b;
        int check = day % 7;
        return map.get(check);
    }
}