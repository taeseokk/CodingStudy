import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean find[] = new boolean[10];
        
        Arrays.sort(numbers);
        Arrays.fill(find,false);
        for(int i=0; i<numbers.length; i++){
            int k = numbers[i];
            find[k]=true;
        }
        for(int j=0; j<10; j++){
            if(find[j]==false){
                answer +=j;
            }
        }
        return answer;
    }
}