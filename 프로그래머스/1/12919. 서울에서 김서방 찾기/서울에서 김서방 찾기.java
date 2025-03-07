class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        
        int count = 0;
        for (String x : seoul) {
            if (x.equals("Kim")) {
                break;
            }
            count += 1;
        }
        answer += count;
        answer += "에 있다";
        return answer;
    }
}