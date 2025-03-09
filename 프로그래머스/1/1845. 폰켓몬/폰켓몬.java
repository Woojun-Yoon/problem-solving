import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int max = nums.length / 2;
        int v = set.size();
        if (v <= max) {
            return v;
        } else {
            return max;
        }
    }
}