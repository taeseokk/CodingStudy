class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long cash = 0;
        for(int i=1; i<=count; i++){
            cash +=(price*i);
        }
        if(cash<=money){
            answer = 0;
        }
        else{
            answer = cash-money;
        }

        return answer;
    }
}