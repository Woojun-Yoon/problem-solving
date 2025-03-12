class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            if (i == ch.length - 1) {
                answer++;
                break;
            }
            
            int check = ch[i];
            int same = 1;
            int diff = 0;
            for (int j = i + 1; j < ch.length; j++) {
                if (check == ch[j]) {
                    same++;
                } else {
                    diff++;
                }
                if (same == diff) {
                    answer++;
                    i = j;
                    break;
                }
                if (j == ch.length - 1) {
                    answer++;
                    i = j;
                }
            }
        }
        
        return answer;
    }
}