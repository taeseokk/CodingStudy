import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        while(n!=0){
            list.add(n%3);
            n = n/3;
        }
        Collections.reverse(list); //리스트 뒤집기
        for(int i=0; i<list.size(); i++){
            answer += list.get(i)*Math.pow(3,i);
        }

        
        return answer;
    }
}