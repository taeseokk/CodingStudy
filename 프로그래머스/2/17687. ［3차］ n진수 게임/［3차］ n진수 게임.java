class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        int index = 0;  //현재 차례
        int turn = p;   // 튜브 차례
        for(int i=0; i<t*m; i++){
            String tmp = Integer.toString(i,n).toUpperCase();
            for(int j=0; j<tmp.length();j++){
                index++;
                if(index==turn){
                 answer += tmp.substring(j,j+1);   
                
                if(answer.length()==t) break;
                    
                    turn +=m;
                }
            }
        }
        return answer;
    }
}