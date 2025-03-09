class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int a = 0;
        int b = 0;
        
        for (String word : goal) {
            if (a < cards1.length && word.equals(cards1[a])) {
                a++;
            } else if (b < cards2.length && word.equals(cards2[b])) {
                b++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}