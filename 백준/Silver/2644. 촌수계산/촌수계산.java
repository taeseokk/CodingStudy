import java.util.*;
import java.io.*;

public class Main {

	static int n, start, end;
	static int answer = -1;
	static boolean[] visited;
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		arr = new int[n + 1][n + 1];

		int m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}
		visited = new boolean[n + 1];
		dfs(start, 0);
		System.out.println(answer);

	}

	private static void dfs(int index, int a) {
		visited[index] = true;
		if (index == end) {
			answer = a;
			return;
		}

		for (int i = 1; i <= n; i++) {
			if (arr[index][i] == 1 && !visited[i])
				dfs(i, a + 1);
		}

	}
}