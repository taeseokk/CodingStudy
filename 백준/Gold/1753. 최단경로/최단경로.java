import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(st.nextToken()); // 정점 : 노드, 데이터 저장
		int E = Integer.parseInt(st.nextToken()); // 간선 : 정점을 연결하는 선

		int K = Integer.parseInt(br.readLine());
		int[] count = new int[V + 1];
		boolean[] visited = new boolean[V + 1];
		ArrayList<ArrayList<Node>> list = new ArrayList<>();

		for (int i = 0; i <= V; i++) {
			list.add(new ArrayList<Node>());
			count[i] = Integer.MAX_VALUE;
		}

		for (int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());

			list.get(u).add(new Node(v, w));
		}

		PriorityQueue<Node> que = new PriorityQueue<>((o1, o2) -> o1.weight - o2.weight);
		count[K] = 0;
		que.add(new Node(K, 0));

		while (!que.isEmpty()) {
			Node now = que.poll();

			if (!visited[now.end])
				visited[now.end] = true;

			for (int i = 0; i < list.get(now.end).size(); i++) {
				Node next = list.get(now.end).get(i);

				if (!visited[next.end] && now.weight + next.weight < count[next.end]) {
					count[next.end] = now.weight + next.weight;

					que.add(new Node(next.end, count[next.end]));
				}
			}
		}

		for (int i = 1; i <= V; i++) {
			if (count[i] == Integer.MAX_VALUE) {
				System.out.println("INF");
			} else {
				System.out.println(count[i]);
			}
		}

	}

}

class Node {
	int end;
	int weight;

	public Node(int end, int weight) {
		this.end = end;
		this.weight = weight;
	}

}
