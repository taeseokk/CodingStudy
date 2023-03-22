import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;
        
        for(int i=0; i<numbers.length; i++){
           int x =  numbers[i];
           if( x ==1 || x==4 || x==7){
               answer+="L";
               left = x;
           }
            else if(x==3 || x==6 || x==9){
                answer+="R";
                right = x;
            }
            else if (x == 2 || x == 5 || x == 8 || x == 0) {
                if(x==0) x = 11;
                int L = (Math.abs(x-left)/3) +(Math.abs(x-left)%3);
                int R = (Math.abs(x-right)/3)+(Math.abs(x-right)%3);
                if(L==R){
                    if(hand.equals("right")){
                        answer+="R";
                        right = x;
                    }
                    else{
                        answer+= "L";
                        left = x;
                    }
                }else if(L>R){
                    right = x;
                    answer += "R";
                }else {
                    left = x;
                    answer+="L";
                }

            }
        }
        
        return answer;
    }
}