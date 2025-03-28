class Solution {
    public int solution(int n) {
        int answer = n + 1;
        int nCount = Integer.toBinaryString(n).replace("0", "").length();
        while (true) {
            if (nCount == Integer.toBinaryString(answer).replace("0", "").length()) {
                break;
            }
            answer++;
        }
        
        return answer;
    }
}