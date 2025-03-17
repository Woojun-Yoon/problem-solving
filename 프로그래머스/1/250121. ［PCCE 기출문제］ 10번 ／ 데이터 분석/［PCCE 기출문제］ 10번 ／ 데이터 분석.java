import java.util.*;
import java.util.stream.*;

class Solution {
    public List<List<Integer>>  solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<List<Integer>> result = new ArrayList<>();
        
        int checkExtIndex;
        switch (ext) {
                case "code" -> checkExtIndex = 0;
                case "date" -> checkExtIndex = 1;
                case "maximum" -> checkExtIndex = 2;
                case "remain" -> checkExtIndex = 3;
                default -> checkExtIndex = -1;
        }
        
        int checkSortIndex;
        switch (sort_by) {
                case "code" -> checkSortIndex = 0;
                case "date" -> checkSortIndex = 1;
                case "maximum" -> checkSortIndex = 2;
                case "remain" -> checkSortIndex = 3;
                default -> checkSortIndex = -1;
        }
        
        for (int[] e : data) {
            if (e[checkExtIndex] < val_ext) {
                result.add(Arrays.stream(e).boxed().collect(Collectors.toList()));
            }
        }
        
        Collections.sort(result, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o1.get(checkSortIndex) - o2.get(checkSortIndex);
            }
        });
        
        System.out.println(result);
        
        return result;
    }
}