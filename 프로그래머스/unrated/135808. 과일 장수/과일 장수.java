import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] score_index = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(score_index,Collections.reverseOrder());
        for(int i=0; i<score_index.length; i++){
            if((i+1)%m==0){
                answer+=score_index[i]*m;
            }
        }
        return answer;
    }
  
}