import java.util.*;

class Solution {
    public int solution(int n) {
        String threeFormation = "";
        int result = 0;
        while (n != 0) {
            int a = n % 3;
            threeFormation = a + threeFormation;
            n = n / 3;
        }
        String[] nums = threeFormation.split("");
        int check = 1;
        for (int i = 0; i < threeFormation.length(); i++) {
            result += check * Integer.parseInt(nums[i]);
            check *= 3;
        }
        return result;
    }
}