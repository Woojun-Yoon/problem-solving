class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int maxCount = 0;
        int minCount = 0;
        int[] answer = new int[2];
        
        for (int lotto : lottos) {
            if (lotto == 0) {
                maxCount++;
                continue;
            }
            for (int winNum : win_nums) {
                if (lotto == winNum) {
                    maxCount++;
                    minCount++;
                    break;
                }
            }
        }
        answer[0] = getLottoResultByHit(maxCount);
        answer[1] = getLottoResultByHit(minCount);
        
        return answer;
    }
    
    private int getLottoResultByHit(int count) {
        switch (count) {
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
}