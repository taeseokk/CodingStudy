class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            int cnt = 0;
            for(int j=i; j<=n; j++){
                cnt +=j;
                if(cnt==n){
                    answer++;
                    break;
                }
                else if(cnt>n){
                    break;
                }
            }
        }
        return answer;
    }
}