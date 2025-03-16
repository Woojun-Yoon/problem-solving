import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int n = board.length;
        Stack<Integer> baguni = new Stack<>();
        
        for (int move : moves) {
            int pick = 0;
            for (int i = 0; i < n; i++) {
                if (board[i][move - 1] != 0) {
                    pick = board[i][move - 1];
                    board[i][move - 1] = 0;
                    break;
                }
            }
            if (pick != 0) {
                baguni.push(Integer.valueOf(pick));
            }
            int baguniSize = baguni.size();
            if (baguniSize >= 2) {
                if (baguni.get(baguniSize - 1).equals(baguni.get(baguniSize - 2))) {
                    baguni.pop();
                    baguni.pop();
                    answer++;
                }
            }
            
        }

        return answer * 2;
    }
}