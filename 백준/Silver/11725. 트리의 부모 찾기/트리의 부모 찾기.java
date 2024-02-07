import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static int[] parent; // 각 노드의 대한 부보 노드 저장 배열
	static ArrayList<Integer>[] list; // 각 노드별 연결되어 있는 노드들을 저장할 ArrayList배열,재열의 리스트가 들어감
	static boolean[] visited; // 특정 노드르 방문처리할 배열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  		n = Integer.parseInt(br.readLine());
		parent = new int[n + 1];
		visited = new boolean[n + 1];
		list = new ArrayList[n + 1];

        for(int i=1; i<=n; i++) {
			list[i] = new ArrayList<>();
		}
		
        for (int i = 0; i < n-1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			list[a].add(b); //ex 2 3
			list[b].add(a); //ex 3 2
		}
		dfs(1);
        
		for(int i=2; i<=n;i++) {
			System.out.println(parent[i]);
		}
	}

	public static void dfs(int node) {
		visited[node] = true;
		for (int v : list[node]) {
			if (!visited[v]) {
				parent[v]=node;
				dfs(v);
			}
		}
	}
}