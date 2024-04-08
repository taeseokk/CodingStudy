import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] X = { 0, 0, -1, 1, -1, -1, 1, 1 };
	static int[] Y = { 1, -1, 0, 0, 1, -1, 1, -1 };
	static int[][] arr;
	static boolean[][] visited;
	static int m, n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		arr = new int[m][n];
		visited = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int answer = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j] && arr[i][j] == 1) {
					dfs(j, i);
					answer++;
				}

			}
		}
		System.out.println(answer);

	}

	static void dfs(int x, int y) {
		visited[y][x] = true;
		for (int i = 0; i < 8; i++) {
			int newX = x + X[i];
			int newY = y + Y[i];
			if (range(newX, newY) && !visited[newY][newX] && arr[newY][newX] == 1) {
				dfs(newX, newY);
			}

		}
	}

	static boolean range(int newX, int newY) {
		return (newX >= 0 && newY >= 0 && newX < n && newY < m);
	}

}
