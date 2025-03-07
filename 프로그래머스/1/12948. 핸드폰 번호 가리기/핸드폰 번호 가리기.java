import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String[] numbers = phone_number.split("");
        for (int i = 0; i < numbers.length - 4; i++) {
            numbers[i] = "*";
        }
        
        String answer = String.join("", numbers);
        return answer;
    }
}