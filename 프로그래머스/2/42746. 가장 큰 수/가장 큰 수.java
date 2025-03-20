import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        // Comparator 사용시, wrapper 객체만 가능
        String[] nums = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });
        
        if (nums[0].equals("0")) {
            return "0";
        }
        
        return String.join("", nums);
    }
}