class Solution {
        static boolean[] visited;
        static int answer = 0;
    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        dfs(begin,target,words,0);
        return answer;
    }
    
    public static void dfs(String begin, String target, String[] words, int cnt){
        //begin : 시작단어
        //target : 찾는 단어
        // word : 단어가 있는 배열
        // cnt : answer
        if(begin.equals(target)){
            answer = cnt;
            return;
        }
        for(int i=0; i<words.length;i++){
            if(visited[i]){
                continue;
            }
            int n = 0;
            for(int j=0; j<begin.length();j++){
                if(begin.charAt(j)==words[i].charAt(j)){
                    n++;
                }
            }
            if(n==begin.length()-1){
                visited[i]=true;
                dfs(words[i],target,words,cnt+1);
                visited[i]=false;
            }
        }
        
    }
        
}