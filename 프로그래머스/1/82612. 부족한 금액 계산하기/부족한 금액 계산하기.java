class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        for (int i = 1; i <= count; i++) {
            total += price * i;
        }
        if (money >= total) {
            return 0;
        } else {
            return total - money;
        }
    }
}