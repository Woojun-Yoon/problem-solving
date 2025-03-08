import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> result = new ArrayList<>();

        for (int[] command : commands) {
            int i = command[0] - 1;
            int j = command[1] - 1;
            int k = command[2] - 1;
            
            int[] check = Arrays.copyOfRange(array, i, j + 1);
            Arrays.sort(check);
            result.add(check[k]);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}