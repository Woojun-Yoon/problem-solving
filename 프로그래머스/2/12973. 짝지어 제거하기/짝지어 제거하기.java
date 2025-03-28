import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        char[] cache = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for (char c : cache) {
            stack.push(c);
            int size = stack.size();
            if (size >= 2 && stack.get(size - 1) == stack.get(size - 2)) {
                stack.pop();
                stack.pop();
            }
        }
        
        if (stack.size() == 0) {
            answer++;
        }
        
        return answer;
    }
}