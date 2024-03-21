import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int F, S, G, U, D;
	static final String str = "use the stairs";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		F = Integer.parseInt(st.nextToken()); // 건물 총 높이
		S = Integer.parseInt(st.nextToken()); // 강호 현재 위치
		G = Integer.parseInt(st.nextToken()); // 스타트업 위치
		U = Integer.parseInt(st.nextToken()); // 위로 이동
		D = Integer.parseInt(st.nextToken()); // 아래로 이동

		int[] count = new int[F + 1];
		boolean[] visited = new boolean[F + 1];
		Queue<Integer> que = new LinkedList<>();
		int[] UD = { U, D };

		count[S] = 0;
		que.offer(S);
		visited[S] = true;

		while (!que.isEmpty()) {
			int index = que.poll();
			if (index == G) {
				System.out.println(count[index]);
				return;
			}

			for (int i = 0; i < 2; i++) {
				int next = 0;

				if (i == 0) {
					next = index + U;
				} else {
					next = index - D;
				}

				if (next > F || next < 1) {
					continue;
				}
				if (!visited[next]) {
					visited[next] = true;
					que.offer(next);
					count[next] = count[index] + 1;
				}
			}

		}
		System.out.println(str);

	}

}

/*
 * BFS는 재귀적 동작 x 어떤 노드를 방문했었는 지의 여부를 검사해야 한다.(무한 루프에 빠질 수 있기 때문) 대기순서에 따라 반복적인
 * 방문을 해야하기 떄문에 queue를 사용
 * 
 * 3 5 2 7 4 1 9 6 5 3 5 7 9 8 10
 */
