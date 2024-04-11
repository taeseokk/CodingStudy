import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int n;
	static int[][] arr;
	static boolean[][] visited;
	static int[] X = {0,1};
	static int[] Y = {1,0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		visited = new boolean[n][n];
		bfs();

	}
	
	static void bfs() {
		Queue<int[]> que = new LinkedList<>();
		visited[0][0] = true;
		que.offer(new int[] {0,0});
		
		while(!que.isEmpty()) {
			int[] index = que.poll();
			int count = arr[index[0]][index[1]];
			if(count == -1) {
				System.out.println("HaruHaru");
				return;
			}
			
			for(int i=0; i<2; i++) {
				int newX = index[0]+X[i]*count;
				int newY = index[1]+Y[i]*count;
				if(range(newX,newY)&&!visited[newX][newY]) {
					visited[newX][newY]=true;
					que.offer(new int[] {newX,newY});
				}
			}
		}
		System.out.println("Hing");
		
	}
	
	static boolean range(int newX, int newY) {
		return (newX>=0 && newY>=0 && newX<n && newY<n);
	}
}


// 출발점은 가장 왼쪽 가장 위의칸 (0,0)에서 시작
