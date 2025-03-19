import java.util.*;
import java.lang.Math.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        int parkH = park.length;
        int parkW = park[0].length;
        
        
        for (int i = 0; i < parkH; i++) {
            for (int j = 0; j < parkW; j++) {
                if (!park[i][j].equals("-1")) {
                    continue;
                }
                int maxSize = 1;
                int maxW = 1;
                int maxH = 1;
                // 현재 칸 기준 최대 H
                for (int h = i + 1; h < parkH; h++) {
                    if (!park[h][j].equals("-1")) {
                        break;
                    }
                    maxH++;
                }
                // 현재 칸 기준 최대 W
                for (int w = j + 1; w < parkW; w++) {
                    if (!park[i][w].equals("-1")) {
                        break;
                    }
                    maxW++;
                }
                // 가능한 MaxSize 도출
                maxSize = Math.min(maxH, maxW);
                if (maxSize <= answer) {
                    continue;
                }
                System.out.println(maxSize);
                // maxH, maxW의 크기 검증
                int result = 0;
                outerLoop:
                for (int k = 1; k <= maxSize; k++) {
                    boolean flag = false;
                    for (int y = i; y < i + k; y++) {
                        for (int x = j; x < j + k; x++) {
                            if (!park[y][x].equals("-1")) {
                                flag = true;
                                break outerLoop;
                            }
                        }
                        if (flag) {
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    } else {
                        result = k;
                    }
                }
                System.out.println(result);
                // maxSize 반영
                if (answer < result) {
                    answer = result;
                }
            }
        }

        int maxMat = 0;
        for (int mat : mats) {
            if (mat <= answer && mat > maxMat) {
                maxMat = mat;
            }
        }
        if (maxMat == 0) {
            return -1;
        }
        return maxMat;
    }
}