class Solution {
    public int solution(int num) {
        if (num == 1) {
            return 0;
        }
        
        int answer = 0;
        long n = (long) num;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            answer += 1;
            if (answer >= 500) {
                return -1;
            }
        }
        return answer;
    }
}