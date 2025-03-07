class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int divisorCount;
        for (int i = left; i <= right; i++) {
            divisorCount = getDivisorCount(i);
            if (isEven(divisorCount)) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
    
    private int getDivisorCount(int num) {
        int result = 0;
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                result += 1;
            } else if (num % i == 0) {
                result += 2;
            }
        }
        return result;
    }
    
    private boolean isEven(int num) {
        return num % 2 == 0 ? true : false;
    }
}