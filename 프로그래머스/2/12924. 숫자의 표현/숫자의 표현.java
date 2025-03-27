class Solution {
    public int solution(int n) {
        int answer = 1;
        
        int limit = (n / 2) + 1;
        for (int i = 1; i <= limit; i++) {
            int check = i;
            for (int j = i + 1; j <= limit; j++) {
                check += j;
                if (check > n) {
                    break;
                } else if (check == n) {
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}