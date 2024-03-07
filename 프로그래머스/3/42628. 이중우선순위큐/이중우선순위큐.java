import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> reversepq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<operations.length; i++){
            StringTokenizer st = new StringTokenizer(operations[i]);
            String type = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            if(pq.size()<1 && type.equals("D")){
              continue;  
            } 
            if(type.equals("I")){
                pq.offer(num);
                reversepq.offer(num);
                continue;
            }if(num<0){
                int min = pq.poll();
                reversepq.remove(min);
                continue;
            }else{
                int max = reversepq.poll();
                pq.remove(max);
            }
            
        }
        int[] answer = new int[2];
        if(pq.size() > 0 ) {
            answer[0] = reversepq.poll();
            answer[1] = pq.poll();
        }
        return answer;
    }
}