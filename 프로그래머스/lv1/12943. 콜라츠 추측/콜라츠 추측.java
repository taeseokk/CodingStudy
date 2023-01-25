class Solution {
    public int solution(double n) {
        int answer = 0;
        while(n!=1){
            if(n%2==0){
                n = n/2;
                answer++;
                if(n==1){
                    break;
                }
            }
            else{
                n = (n*3)+1;
                answer++;
            }
        }
        if(answer>500){
            answer = -1;
        }
        
        
        return answer;
    }
}