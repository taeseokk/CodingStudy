class Solution {
    public String solution(int n) {
        String answer = "";
        
        String[] number = {"4", "1", "2"};
        
        while(n>0){
            answer = number[n%3]+answer;
            n = (n-1)/3;
        }
        return answer;
    }
}