import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> cache = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        
        for (int s : score) {
            cache.add(s);
            cache.sort(Comparator.naturalOrder());
            if (cache.size() == k + 1) {
                cache.remove(0);
            }
            result.add(cache.get(0));
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}