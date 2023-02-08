class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        for(int i=1; i<food.length; i++){
            int index = food[i]/2;
            for(int j=0; j<index; j++){
                answer += Integer.toString(i);
            }
        }
        answer += Integer.toString(0);
        
        for(int i=food.length-1; i>0; i--){
            int count = food[i]/2;
            for(int j=0; j<count; j++){
                answer +=Integer.toString(i);
            }
        }
        return answer;
    }
}