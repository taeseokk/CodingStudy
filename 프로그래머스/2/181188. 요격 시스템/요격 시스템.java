import java.util.*;
class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        
        Arrays.sort(targets,(o1,o2) -> {
            return o1[1] - o2[1];
        }); //2번째 숫자를 기준으로 오름차순
        
        int index = 0;
        for(int i=0; i<targets.length; i++){
            if(index<=targets[i][0]){
                index = targets[i][1];
                answer++;
            }
        }
        
        return answer;
    }
}