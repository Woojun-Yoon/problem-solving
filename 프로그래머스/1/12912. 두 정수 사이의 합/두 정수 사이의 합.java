class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int c = a;
        if (a > b) {
            a = b;
            b = c;
        }
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}