import java.util.*;
import java.lang.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] f = new int[N];
        int[] c = new int[N];
        Arrays.fill(f, 0);
        Arrays.fill(c, 0);
        
        for (int fail : stages) {
            if (fail > N) {
                continue;
            }
            f[fail - 1] += 1;
        }
        
        for (int check : stages) {
            for (int i = 0; i < check; i++) {
                if (i >= N) {
                    continue;
                }
                c[i]++;
            }
        }
        
        Map<Integer, Double> map = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {
            if (c[i] == 0) {
                map.put(i + 1, 0.0);
            } else {
                map.put(i + 1, (double) f[i] / c[i]);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        return list.stream().mapToInt(i -> i).toArray();
    }
}