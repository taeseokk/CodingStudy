import java.util.*;
class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] arr = new char[m][n]; // 2차원 배열에 넣기
        for (int i = 0; i < m; i++) {
            arr[i] = board[i].toCharArray();
        }
        while(true){
            boolean[][] visit = new boolean[m][n];
            boolean type = false;
        for(int i=0; i<m-1; i++){
            for(int j=0; j<n-1; j++){
                if(arr[i][j]==arr[i][j+1]&&arr[i][j]==arr[i+1][j]&&arr[i][j]==arr[i+1][j+1]&&arr[i][j]!='/'){
                        visit[i][j] = true;
                        visit[i + 1][j] = true;
                        visit[i][j + 1] = true;
                        visit[i + 1][j + 1] = true;
                        type = true;
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (visit[i][j]) {
                        arr[i][j] = '/';
                    }
                }
            }
            if (!type) {
                break;
            }
            for(int i=0; i<n; i++){
                Queue<Character> que = new LinkedList<>();
                for(int j=m-1; j>=0; j--){
                    if(arr[j][i] !='/'){
                        que.add(arr[j][i]);
                    }
                }
                if(que.size()<m){
                    int blank = m-que.size();
                    for(int q=0; q<blank; q++){
                        que.add('/');
                    }
                }
                for(int k=m-1; k>=0;k--){
                    arr[k][i] = que.poll();
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j]=='/') answer++;
            }
        }
        
        return answer;
    }
}