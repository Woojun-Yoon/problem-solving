import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> nums = new ArrayList<>();
        int min = arr[0];
        for (int n : arr) {
            nums.add(n);
            if (min > n) {
                min = n;
            }
        }
        nums.remove(Integer.valueOf(min));
        if (nums.isEmpty()) {
            nums.add(-1);
        }
        return nums.stream().mapToInt(i -> i).toArray();
    }
}