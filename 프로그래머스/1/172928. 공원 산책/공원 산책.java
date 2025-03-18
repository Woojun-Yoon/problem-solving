import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0, 0};
        int maxH = park.length;
        int maxW = park[0].length();
        // park 초기화
        char[][] p = new char[maxH][maxW];
        for (int i = 0; i < maxH; i++) {
            char[] line = park[i].toCharArray();
            for (int j = 0; j < maxW; j++) {
                p[i][j] = line[j];
                if (p[i][j] == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        // 이동 결과 계산
        for (String route : routes) {
            String[] check = route.split(" ");
            String op = check[0];
            int n = Integer.parseInt(check[1]);
            int h = answer[0];
            int w = answer[1];
            boolean flag = true;
                
            // 북쪽
            if (op.equals("N")) {
                if (h - n < 0) {
                    flag = false;
                } else {
                    for (int i = h; i >= h - n; i--) {
                        if (p[i][w] == 'X') {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    answer[0] = h - n;
                }
            }
            // 남쪽
            if (op.equals("S")) {
                if (h + n > maxH - 1) {
                    flag = false;
                } else {
                    for (int i = h; i <= h + n; i++) {
                        if (p[i][w] == 'X') {
                            flag = false;
                            break;
                        }
                    }
                }
                
                if (flag) {
                    answer[0] = h + n;
                }
            }
            // 서쪽
            if (op.equals("W")) {
                if (w - n < 0) {
                    flag = false;
                } else {
                    for (int i = w; i >= w - n; i--) {
                        if (p[h][i] == 'X') {
                            flag = false;
                            break;
                        }
                    }
                }
                
                if (flag) {
                    answer[1] = w - n;
                }
            }
            // 동쪽
            if (op.equals("E")) {
                if (w + n > maxW - 1) {
                    flag = false;
                } else {
                    for (int i = w; i <= w + n; i++) {
                        if (p[h][i] == 'X') {
                            flag = false;
                            break;
                        }
                    }
                }
                if (flag) {
                    answer[1] = w + n;
                }
            }
        }
        return answer;
    }
}