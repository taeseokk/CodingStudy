import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()); //내림차순
        for(int i=0; i<works.length; i++){
            q.offer(works[i]);
        }

        while(n!=0){
            int index = q.poll(); //가장 큰 수부터
            if(index==0) break;
            index--;
            q.offer(index);
            n--;
        }
        long answer = 0;
        for(int time : q){
            answer += time*time;
        }
        return answer;
    }
}