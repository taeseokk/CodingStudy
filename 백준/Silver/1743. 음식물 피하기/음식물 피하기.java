import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] X = { 0, 0, 1, -1 };
	static int[] Y = { 1, -1, 0, 0 };
	static int n, m, count;
	static int[][] arr;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // 세로
		m = Integer.parseInt(st.nextToken()); // 가로
		int k = Integer.parseInt(st.nextToken()); // 쓰레기의 개수

		arr = new int[n][m];
		visited = new boolean[n][m];
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			arr[r - 1][c - 1] = 1;

		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!visited[i][j] && arr[i][j] == 1) {
					count = 0;
					dfs(i, j);
					max = Math.max(count, max);
				}
			}
		}
		System.out.println(max);

	}

	static void dfs(int r, int c) {
		visited[r][c] = true;
		count++;
		for (int i = 0; i < 4; i++) {
			int newX = c + X[i];
			int newY = r + Y[i];

			if (range(newX, newY) && !visited[newY][newX] && arr[newY][newX] == 1) {
				dfs(newY, newX);
			}
		}
		
	}

	static boolean range(int newX, int newY) {
		return (newX >= 0 && newY >= 0 && newX < m && newY < n);
	}
}
// c : x좌표
// r : y좌표