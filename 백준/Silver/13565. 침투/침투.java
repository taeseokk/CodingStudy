import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[] X = { 0, 0, -1, 1 };
	static int[] Y = { 1, -1, 0, 0 };
	static int[][] map;
	static boolean[][] visited;
	static Queue<Point> que;
	static int m, n;
	static String answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		map = new int[m][n];
		visited = new boolean[m][n];
		answer = "NO";
		que = new LinkedList<>();

		for (int i = 0; i < m; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(s.substring(j, j + 1));
			}
		}

		for (int i = 0; i < n; i++) {
			if (!visited[0][i] && map[0][i] == 0) {
				que.offer(new Point(i, 0));
			}
		}
		bfs();

		System.out.println(answer);

	}

	static void bfs() {
		while (!que.isEmpty()) {
			Point pt = que.poll();
			int nowX = pt.x;
			int nowY = pt.y;

			if (nowY == m - 1) {
				answer = "YES";
				return;
			}
			visited[nowY][nowX] = true;
			for (int i = 0; i < 4; i++) {

				int newX = pt.x + X[i];
				int newY = pt.y + Y[i];

				if (check(newX, newY) && !visited[newY][newX] && map[newY][newX] == 0) {
					que.offer(new Point(newX, newY));
					visited[newY][newX] = true;
				}
			}
		}
	}

	static boolean check(int x, int y) {
		return (x >= 0 && y >= 0 && x < n && y < m);
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}