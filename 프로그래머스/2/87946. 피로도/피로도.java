class Solution {
    public int answer = 0;
    public boolean[] visit;
    
    public int solution(int k, int[][] dungeons) {
        // 방문 여부 확인을 위한 배열 선언
        visit = new boolean[dungeons.length];
        dfs(0,k,dungeons);
        return answer;
    }
    
    public void dfs(int depth, int k, int[][] dungeons){
        for(int i=0; i<dungeons.length; i++){
            // 방문하지 않은 상태면서 k가 최소 필요 피로도보다 크거나 같은 경우
            if(!visit[i] && dungeons[i][0] <=k){
                visit[i] = true; //방문o
                dfs(depth+1, k-dungeons[i][1], dungeons);
                visit[i]=false; // 방문x
            }
        }
        answer = Math.max(answer,depth);
    }
}