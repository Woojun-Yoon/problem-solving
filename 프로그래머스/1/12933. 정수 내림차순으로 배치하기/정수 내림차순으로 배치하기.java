import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] charArray = Long.valueOf(n).toString().toCharArray();
        Arrays.sort(charArray);
        StringBuilder stringBuilder = new StringBuilder(new String(charArray));
        String reversedString = stringBuilder.reverse().toString();
        return Long.valueOf(reversedString);
    }
}