import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> nums = new ArrayList<>();
        for (int element : arr) {
            if (element % divisor == 0) {
                nums.add(element);
            }
        }
        if (nums.size() == 0) {
            nums.add(-1);
            return nums.stream().mapToInt(i -> i).toArray();
        } else {
            nums.sort(Comparator.naturalOrder());
            return nums.stream().mapToInt(i -> i).toArray();
        }
    }
}