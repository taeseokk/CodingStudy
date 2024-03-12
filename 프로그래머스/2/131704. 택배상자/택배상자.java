import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int index = 0;
        for(int i=1; i<=order.length; i++){
            if(order[index]!=i){
                stack.push(i);
            }else{
                answer++;
                index++;
            }
            while(!stack.isEmpty() &&stack.peek()==order[index]){
                stack.pop();
                index++;
                answer++;
            }
        }
        return answer;
    }
}