class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        int mid = str.length / 2;

        if (str.length % 2 == 0) {
            answer += str[mid - 1];
            answer += str[mid];
        } else {
            answer += str[mid];
        }
        return answer;
    }
}