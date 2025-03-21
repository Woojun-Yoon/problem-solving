import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // min heap init
        for (int s : scoville) {
            minHeap.add(s);
        }
        if (minHeap.peek() >= K) {
            return answer;
        }
        // Calculate
        while (true) {
            int a = minHeap.poll();
            int b = minHeap.poll();
            int mix = a + (b * 2);
            minHeap.add(mix);
            answer++;
            if (minHeap.size() == 1 && minHeap.peek() < K) {
                return -1;
            }
            if (minHeap.peek() >= K) {
                break;
            }
        }
        
        return answer;
    }
}