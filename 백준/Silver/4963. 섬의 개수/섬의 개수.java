import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] X = { 0, 0, -1, 1, -1, -1, 1, 1 };
	static int[] Y = { 1, -1, 0, 0, 1, -1, 1, -1 };
	static int nowX, nowY;
	static int w, h;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		// 1 : 땅 0 : 바다
		while (true) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			h = Integer.parseInt(st.nextToken());
			
			if (w == 0 && h == 0)
				break;
			
			int[][] arr = new int[h][w];
			boolean[][] visited = new boolean[h][w];

			for (int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < w; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int count = 0;
			
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (arr[i][j] == 1 && visited[i][j] == false) {
						dfs(i, j, visited, arr);
						count++;
					}
				}
			}
			
			sb.append(count).append("\n");

		}
		
		System.out.println(sb);

	}

	static void dfs(int newH, int newW, boolean[][] visited, int[][] arr) {

		visited[newH][newW] = true;

		for (int i = 0; i < 8; i++) {
			nowX = newW + X[i];
			nowY = newH + Y[i];

			if (range() && visited[nowY][nowX] == false && arr[nowY][nowX] == 1) {
				visited[nowY][nowX] = true;
				dfs(nowY, nowX, visited, arr);
			}
		}

	}

	static boolean range() {
		return (nowX >= 0 && nowX < w && nowY >= 0 && nowY < h);
	}

}
