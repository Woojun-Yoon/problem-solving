class Solution {
    public long solution(long n) {
        long answer = 0;
        long count = 1;
        long result = 0;
        while (result < n) {
            result = count* count;
            count++;
        }
        if (result == n) {
            return count * count;
        } else {
            return -1L;
        }
    }
}