import java.util.*;
import java.io.*;

public class Main {
	static int chX[] = {0, 0, -1, 1};
	static int chY[] = {-1, 1, 0, 0};
	static int arr[][];
	static boolean visited[][];

	static int now_x, now_y;
	static int m, n, k;
	static int answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());

			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());

			arr = new int[n][m];
			visited = new boolean[n][m];

			for(int j=0; j<k; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr[y][x] = 1; // 좌표 단방향
			}

			answer = 0;
			for(int j=0; j<n; j++) {
				for(int k=0; k<m; k++) {

					if(arr[j][k] == 1 && !visited[j][k]) {
						dfs(k, j);
						answer++;
					}
				}
			}
			sb.append(answer).append('\n');
		}

		System.out.println(sb);
	}
	
	public static void dfs(int x, int y) {
		visited[y][x] = true;

		for(int i=0; i<4; i++) {
			now_x = x + chX[i];
			now_y = y + chY[i];

			if(Range_check() && visited[now_y][now_x] == false && arr[now_y][now_x] == 1) {
				dfs(now_x, now_y);
			}

		}
	}

	static boolean Range_check() {
		return (now_y < n && now_y >= 0 && now_x < m && now_x >= 0);
	}

} 