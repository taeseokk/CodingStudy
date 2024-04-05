import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] X = { 0, 0, -1, 1 };
	static int[] Y = { 1, -1, 0, 0 };
	static char[][] arr;
	static boolean[][] visited;
	static int n, m;
	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new char[n][m];
		visited = new boolean[n][m];
		
		int dx = 0;
		int dy = 0;
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = s.charAt(j);
				if (arr[i][j] == 'I') {
					dx = j;
					dy = i;
				}
			}
		}
		dfs(dx, dy);
		if (count == 0) {
			System.out.println("TT");
		} else {
			System.out.println(count);
		}

	}

	static void dfs(int x, int y) {
		visited[y][x] = true;
		if (arr[y][x] == 'P')
			count++;

		for (int i = 0; i < 4; i++) {
			int newX = x + X[i];
			int newY = y + Y[i];

			if (range(newX, newY) && !visited[newY][newX]) {
				if (arr[newY][newX] != 'X') {
					dfs(newX, newY);
				}
			}
		}
	}

	static boolean range(int newX, int newY) {
		return (newX >= 0 && newY >= 0 && newX < m && newY < n);
	}
}
