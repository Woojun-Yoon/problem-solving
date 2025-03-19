import java.util.*;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int[] answer = getTimeArray(pos);
        int[] minLen = {0, 0};
        int[] maxLen = getTimeArray(video_len);
        int[] opStart = getTimeArray(op_start);
        int[] opEnd = getTimeArray(op_end);
        
        if (isPrev(opEnd, answer) && isNext(opStart, answer)) {
            answer[0] = opEnd[0];
            answer[1] = opEnd[1];
        }
        System.out.println(answer[0]+":"+answer[1]);
        
        for (String com : commands) {
            if (com.equals("next")) {
                // Next Command
                answer[1] += 10;
                if (answer[1] >= 60) {
                    answer[1] -= 60;
                    answer[0] += 1;
                }
                if (isNext(maxLen, answer)) {
                    answer[0] = maxLen[0];
                    answer[1] = maxLen[1];
                }
            } else {
                // Pred Command
                answer[1] -= 10;
                if (answer[1] < 0) {
                    answer[1] += 60;
                    answer[0] -= 1;
                }
                if (isPrev(minLen, answer)) {
                    answer[0] = minLen[0];
                    answer[1] = minLen[1];
                }
            }
            
            if (isPrev(opEnd, answer) && isNext(opStart, answer)) {
                answer[0] = opEnd[0];
                answer[1] = opEnd[1];
            }
            System.out.println(answer[0]+":"+answer[1]);
        }
        String m = (answer[0] >= 10) ? "" + answer[0] : "0" + answer[0];
        String s = (answer[1] >= 10) ? "" + answer[1] : "0" + answer[1];
        
        return m + ":" + s;
    }
    
    private int[] getTimeArray(String t) {
        String[] mmss = t.split(":");
        int[] result = new int[2];
        result[0] = Integer.parseInt(mmss[0]);
        result[1] = Integer.parseInt(mmss[1]);
        return result;
    }
    
    private boolean isNext(int[] cur, int[] check) {
        if (cur[0] > check[0] || (cur[0] == check[0] && cur[1] > check[1])) {
            return false;
        }
        return true;
    }
    
    private boolean isPrev(int[] cur, int[] check) {
        if (cur[0] < check[0] || (cur[0] == check[0] && cur[1] < check[1])) {
            return false;
        }
        return true;
    }
}