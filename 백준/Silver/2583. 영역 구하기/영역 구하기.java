import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static int[] X = { 0, 0, 1, -1 };
	static int[] Y = { 1, -1, 0, 0 };
	static int[][] arr;
	static boolean[][] visit;
	static int now_x, now_y, m, n;
	static int answer;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		ArrayList<Integer> list = new ArrayList<>();

		m = Integer.parseInt(st.nextToken()); // y좌표
		n = Integer.parseInt(st.nextToken()); // x좌표
		int k = Integer.parseInt(st.nextToken());
		arr = new int[m][n];
		visit = new boolean[m][n];

		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			for (int y = y1; y < y2; y++) {
				for (int x = x1; x < x2; x++) {
					arr[y][x] = 1;
				}
			}
		}

		for (int q = 0; q < m; q++) { // y좌표
			for (int w = 0; w < n; w++) {// x좌표
				if (arr[q][w] == 0 && !visit[q][w]) {
					answer = 0;
					dfs(w, q);
					list.add(answer);
				}
			}
		}
		Collections.sort(list);
		System.out.println(list.size());
		for (Integer num : list) {
			System.out.print(num + " ");
		}

	}

	public static void dfs(int x, int y) {

		visit[y][x] = true;
		answer++;
		for (int i = 0; i < 4; i++) {
			now_x = x + X[i];
			now_y = y + Y[i];

			if (check() && visit[now_y][now_x] == false && arr[now_y][now_x] == 0) {

				dfs(now_x, now_y);
			}
		}
	}

	static boolean check() {
		return (now_y < m && now_y >= 0 && now_x < n && now_x >= 0);
	}
}