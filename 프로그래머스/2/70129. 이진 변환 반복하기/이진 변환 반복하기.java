class Solution {
    public int[] solution(String s) {
        int[] answer = {0, 0};
        String cache = s;
        
        while (!cache.equals("1")) {
            int beforeSize = cache.length();
            cache = cache.replace("0", "");
            int afterSize = cache.length();
            answer[0] += 1;
            answer[1] += beforeSize - afterSize;
            cache = Integer.toBinaryString(afterSize);
        }
        
        return answer;
    }
}