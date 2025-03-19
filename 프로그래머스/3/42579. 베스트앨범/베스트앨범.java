import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 초기화
        Map<String, Integer> total = new HashMap<>();
        Map<String, int[]> bestIndex = new HashMap<>();
        Map<String, int[]> bestScore = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(genres));
        for (String genre : set) {
            total.put(genre, 0);
            int[] tmp1 = {-1, -1};
            bestIndex.put(genre, tmp1);
            int[] tmp2 = {-1, -1};
            bestScore.put(genre, tmp2);
        }
        System.out.println(total);
        System.out.println(bestIndex);
        System.out.println(bestScore);
        // 계산
        for (int i = 0; i < genres.length; i++) {
            String check = genres[i];
            int score = plays[i];
            // 해당 장르의 총합 갱신
            total.replace(check, total.get(check) + score);
            int[] bs = bestScore.get(check);
            int[] bi = bestIndex.get(check);
            if (bs[0] < score || (bs[0] == score && bi[0] > i)) {
                bs[1] = bs[0];
                bs[0] = score;
                bi[1] = bi[0];
                bi[0] = i;
            } else if (bs[1] < score || (bs[1] < score && bi[1] > i)) {
                bs[1] = score;
                bi[1] = i;
            }
        }
        List<String> genreSort = new ArrayList<>(total.keySet());
        genreSort.sort((i1, i2) -> (total.get(i2) - total.get(i1)));
        System.out.println(genreSort);
        
        List<Integer> result = new ArrayList<>();
        for (String s : genreSort) {
            int[] cache = bestIndex.get(s);
            result.add(cache[0]);
            if (cache[1] != -1) {
                result.add(cache[1]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}