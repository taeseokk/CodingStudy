import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashSet<Integer> left = new HashSet<>();
        HashMap<Integer,Integer> right = new HashMap<>();
        
        for(int index : topping){
            right.put(index,right.getOrDefault(index,0)+1);
        }
        
        for(int index : topping){
            right.put(index,right.get(index)-1);
            left.add(index);
            if(right.get(index)==0){
                right.remove(index);
            }
            if(right.size()==left.size()){
                answer++;
            }
            
        }
        
        
        return answer;
    }
}