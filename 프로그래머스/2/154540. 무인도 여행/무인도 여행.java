import java.util.*;
class Solution {
    private final int[] X = {0,0,-1,1};
    private final int[] Y = {1,-1,0,0};
    private int count;
    private int n,m;
    // x 세로,m 가로
    public int[] solution(String[] maps) {
        ArrayList<Integer> list = new ArrayList<>();
        n = maps.length;
        m = maps[0].length();
        int[][] arr = new int[n][m];
        
        for(int i=0; i<n; i++){
            String s = maps[i];
            for(int j=0; j<s.length();j++){
                if(s.substring(j,j+1).equals("X")){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = Integer.parseInt(s.substring(j,j+1));
                }
            }
        }
        
        boolean[][] visited = new boolean[n][m];
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                
                if(!visited[i][j] && arr[i][j] !=0){
                    count = 0;
                    dfs(visited,j,i,arr);
                    list.add(count);
                    
                }
            }
        }
        if(list.isEmpty()) return new int[]{-1};
        
        Collections.sort(list);
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    private void dfs(boolean[][] visited, int nx, int ny,int[][] arr){
        visited[ny][nx] = true;
        count += arr[ny][nx];
        
        for(int i=0; i<4; i++){
            int newX = nx+X[i];
            int newY = ny+Y[i];
            
            if(range(newX,newY) && !visited[newY][newX] &&arr[newY][newX] >0){
                dfs(visited,newX,newY,arr);
            }
        }
    }
    
    
    private boolean range(int x, int y){
        return (x>=0 && y>=0 && x<m && y<n);
    }
}