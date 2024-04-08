import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<ArrayList<Integer>> list;
	static boolean[] visited;
	static int answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		list = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
		}

		for (int i = 1; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());

			list.get(X).add(Y);
			list.get(Y).add(X);
		}
		visited = new boolean[n + 1];
		
		dfs(1,0);
		if(answer %2==0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

	static void dfs(int node, int count) {
		visited[node] = true;

		for (int index : list.get(node)) {
			if (!visited[index]) {
				dfs(index, count + 1);
			}
		}
		if(node !=1 && list.get(node).size() ==1) {
			answer += count;
		}
	}
}

// 1번 정점 : 루트 노드
