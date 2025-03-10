class Solution {
    public int solution(int[] wallet, int[] bill) {
        int walletW = wallet[0];
        int walletH = wallet[1];
        int billW = bill[0];
        int billH = bill[1];
        int answer = 0;
        
        while (true) {
            if (walletW >= billW && walletH >= billH) {
                break;
            } else if (walletW >= billH && walletH >= billW) {
                break;
            } else {
                if (billW > billH) {
                    billW = billW / 2;
                    answer++;
                } else {
                    billH = billH / 2;
                    answer++;
                }
            }
        }
        
        return answer;
    }
}