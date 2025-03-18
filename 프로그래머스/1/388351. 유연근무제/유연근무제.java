class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            int time = schedules[i];
            time += 10;
            if (time % 100 > 59) {
                time += 40;
            }
            schedules[i] = time;
        }
        
        for(int test : schedules) {
            System.out.println(test);
        }
        
        for (int i = 0; i < schedules.length; i++) {
            int[] log = timelogs[i];
            boolean flag = true;
            for (int j = 0; j < 7; j++) {
                if ((startday + j) == 6 
                    || (startday + j) == 7 
                    || (startday + j) == 13) {
                    continue;
                }
                
                if (log[j] > schedules[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
            }
        }
        
        return answer;
    }
}