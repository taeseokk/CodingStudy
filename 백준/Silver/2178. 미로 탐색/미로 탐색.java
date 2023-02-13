import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited; //2차원이기 때문에 2차원으로 배열
    static int[][] A;    //받을 것 
    static int N, M;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<M; j++){
                A[i][j] = Integer.parseInt(line.substring(j,j+1));
                
            }
        }
        BFS(0,0);
        System.out.println(A[N-1][M-1]);
    }
    private static void BFS(int i, int j){
        Queue<int[]>queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        visited[i][j] = true;
        while(!queue.isEmpty()){        //queue가 빌때까지
            int now[] = queue.poll();
            for(int k=0; k<4; k++){    //상하좌우 탐색을 위해서
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];
                if(x>=0 && y >=0 && x<N && y<M){    //배열이 넘어가면x
                    if(A[x][y]!=0 && !visited[x][y]){    //0또는 방문한 배열인지 확인
                        //두가지 모두 가능하면 방문 가능한 곳
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1; 
                        queue.add(new int[] {x,y});
                    }
                }
            }
        }
    }
}