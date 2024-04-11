import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[] X = { 0, 0, -1, 1 };
	static int[] Y = { 1, -1, 0, 0 };
	static int n, m;
	static int[][] arr;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n][m];
		visited = new boolean[n][m];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				int r = Integer.parseInt(st.nextToken());
				int g = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				arr[i][j] = (r + g + b) / 3;
			}
		}
		
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] >= t) {
					arr[i][j] = 255;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!visited[i][j] && arr[i][j] == 255) {
					dfs(j, i);
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

	static void dfs(int x, int y) {
		visited[y][x] = true;
		for (int i = 0; i < 4; i++) {
			int newX = x + X[i];
			int newY = y + Y[i];

			if (range(newX, newY) && !visited[newY][newX] && arr[newY][newX] == 255) {
				dfs(newX, newY);
			}
		}
	}

	static boolean range(int newX, int newY) {
		return (newX >= 0 && newY >= 0 && newX < m && newY < n);
	}
}