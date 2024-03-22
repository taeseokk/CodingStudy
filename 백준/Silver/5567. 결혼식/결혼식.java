import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}
		visited = new boolean[n + 1];
		visited[1] = true; // 상근이

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());

			graph.get(from).add(to);
			graph.get(to).add(from);
		}
		dfs(1, 0);

		int count = 0;
		for (int i = 2; i < visited.length; i++) {
			if (visited[i])
				count++;
		}
		
		System.out.println(count);

	}

	static void dfs(int depth, int answer) {
		if (answer == 2) { // 친구의 친구까지만
			return;
		}
		for (int num : graph.get(depth)) {
			visited[num] = true;
			dfs(num, answer + 1);
		}
	}
}
/*
 * 0 : 전류가 통함 1 : 전류가 안통함
 */

//1 : 2 3
//2 : 1 3
//3 : 1 2
//4 : 3 5
//5 : 4