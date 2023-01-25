class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int a = x/10000;
        int b = (x%10000)/1000;
        int c = (x%1000)/100;
        int d = (x%100)/10;
        int e = x%10;
        int sum = a+b+c+d+e;
        
        if(x%sum==0){
            answer = true;
        }
        else{
            answer = false;
        }
        return answer;
    }
}