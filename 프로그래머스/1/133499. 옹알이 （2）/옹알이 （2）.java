class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] p = {"aya", "ye", "woo", "ma"};
        
        for (String bab : babbling) {
            boolean isValid = true;
            for (String e : p) {
                if (bab.contains(e + e)) {
                    isValid = false;
                    break;
                }
            }
            
            bab = bab.replace("aya", " ")
                    .replace("ye", " ")
                    .replace("woo", " ")
                    .replace("ma", " ")
                    .replace(" ", "");
            if (bab.isEmpty() && isValid) {
                answer++;
            }
        }
        return answer;
    }
}