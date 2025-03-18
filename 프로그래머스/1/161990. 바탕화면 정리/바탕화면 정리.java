import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        int h = wallpaper.length;
        int w = wallpaper[0].length();
        
        char[] cacheH = new char[h];
        char[] cacheW = new char[w];
        Arrays.fill(cacheH, '.');
        Arrays.fill(cacheW, '.');
        
        for (int i = 0; i < h; i++) {
            char[] line = wallpaper[i].toCharArray();
            for (int j = 0; j < w; j++) {
                if (line[j] == '#') {
                    cacheH[i] = '#';
                    cacheW[j] = '#';
                }
            }
        }
        
        int minH = h;
        int maxH = 0;
        int minW = w;
        int maxW = 0;
        
        for (int i = 0; i < cacheW.length; i++) {
            if (cacheW[i] == '#') {
                if (minW > i) {
                    minW = i;
                }
                if (maxW < i + 1) {
                    maxW = i + 1;
                }
            }
        }
        for (int i = 0; i < cacheH.length; i++) {
            if (cacheH[i] == '#') {
                if (minH > i) {
                    minH = i;
                }
                if (maxH < i + 1) {
                    maxH = i + 1;
                }
            }
        }
        
        int[] answer = {minH, minW, maxH, maxW};
        return answer;
    }
}