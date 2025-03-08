class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int c = food[i] / 2;
            for (int j = 0; j < c; j++) {
                sb.append(i);
            }
        }
        String a = sb.toString();
        String b = sb.reverse().toString();
        return a + "0" + b;
    }
}