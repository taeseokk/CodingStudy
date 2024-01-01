import java.util.*;

class Solution {
    public int solution(int n, int k) {
        String s = "";
        int answer = 0;
        
        //n진법 계산
        while(n!=0){
            s = n%k+s;
            n = n/k;
        }
        String[] arr = s.split("0");
        for(String str : arr){
            if(str.equals("")) continue;
            long num = Long.parseLong(str);
            if(check(num)){
                answer++;
            }
        }
        return answer;
    }
    
    public boolean check(long number){
        if(number<2) return false;
        //Math.sqrt = 제곱근 구하기
        for(int i=2; i<=Math.sqrt(number); i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
        
    }
}