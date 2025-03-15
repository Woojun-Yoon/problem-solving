import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        String answer = participant[participant.length - 1];
        int checkIndex = 0;
        for (int i = 0; i < completion.length; i++) {
            if (participant[checkIndex].equals(completion[i])) {
                checkIndex++;
                continue;
            }
            answer = participant[checkIndex];
            break;
        }

        
        
        return answer;
    }
}