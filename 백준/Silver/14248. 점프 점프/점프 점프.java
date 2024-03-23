import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static int[] arr;
	static int n, s;
	static int count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine()); // 돌 개수
		arr = new int[n + 1];
		visited = new boolean[n + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		s = Integer.parseInt(br.readLine()); // 출발점
		count = 1;
		visited[s] = true;
		dfs(s);

		System.out.println(count);

	}

	public static void dfs(int index) {
		int left = index - arr[index];
		int right = index + arr[index];
		if (right <= n && !visited[right]) {
			visited[right] = true;
			count++;
			dfs(right);
		}
		if (left > 0 && !visited[left]) {
			visited[left] = true;
			count++;
			dfs(left);
		}
	}

	static boolean range(int nowN) {
		return (nowN > 0 && nowN <= n);
	}
}
