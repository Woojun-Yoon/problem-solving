class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int check = 1;
        int col = 1;
        int checkCol = 0;
        boolean reverse = false;
        
        while (check < n + 1) {
            // 현재 수가 찾으려는 상자와 같으면
            if (check == num) {
                answer++;
                checkCol = col;
            }
            if (check > num && checkCol == col) {
                answer++;
            }
            
            if (check > w && check % w == 1) {
                reverse = reverse ? false : true;
            }
            System.out.printf("check=%d,answer=%d,checkCol=%d,col=%d \n", check, answer, checkCol, col);
            // 다음 수로 넘김
            check++;
            // 다음 수의 컬럼으로 넘김
            if (check % w != 1 && w != 1) {
                col = (reverse) ? col - 1 : col + 1;
            }
        }
        
        return answer;
    }
}