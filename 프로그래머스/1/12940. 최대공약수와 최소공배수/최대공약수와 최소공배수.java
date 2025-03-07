class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGcd(n, m);
        int lcm = (n * m) / gcd;
        
        int[] answer = {gcd, lcm};
        return answer;
    }
    
    private int getGcd(int n, int m) {
        int result;
        while (m != 0) {
            result = n % m;
            n = m;
            m = result;
        }
        return n;
    }
}