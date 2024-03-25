import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[] X = { 0, 0, -1, 1 };
	static int[] Y = { 1, -1, 0, 0 };
	static int nowX, nowY;
	static int n, m;
	static int[][] arr;
	static Queue<int[]> que;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		que = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (arr[i][j] == 1) {
					que.offer(new int[] { i, j });
				}
			}
		}
		System.out.println(bfs());
	}

	public static int bfs() {
		while (!que.isEmpty()) {
			int[] index = que.poll();
			int x = index[0];
			int y = index[1];

			for (int i = 0; i < 4; i++) {
				nowX = x + X[i];
				nowY = y + Y[i];

				if (range() && arr[nowX][nowY] == 0) {
					arr[nowX][nowY] = arr[x][y] + 1;
					que.offer(new int[] { nowX, nowY });
				}
			}
		}
		int max = -1;
		if (check()) {
			return -1;
		} else {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (max < arr[i][j]) {
						max = arr[i][j];
					}
				}
			}
		}
		return max - 1;

	}

	static boolean range() {
		return (nowX >= 0 && nowY >= 0 && nowX < n && nowY < m);
	}

	static boolean check() {
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < m; k++) {
				if (arr[j][k] == 0) {
				return true;
				}
			}
		}
		return false;
	}
}

// 1 : 익은 0 : 익지 않은 -1 : 토마토가 없음