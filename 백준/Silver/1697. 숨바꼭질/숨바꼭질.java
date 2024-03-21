import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[] count = new int[100001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()); // 수빈 현재 위치
		int k = Integer.parseInt(st.nextToken()); // 동생 위치(목표)
		if (n == k) {
			System.out.println(0);
			return;
		}
		Queue<Integer> que = new LinkedList<>();
		count[n] = 1;
		que.offer(n);

		while (!que.isEmpty()) {
			int index = que.poll();
            
			for (int i = 0; i < 3; i++) {
				int next = 0;

				if (i == 0) {
					next = index - 1;
				} else if (i == 1) {
					next = index + 1;
				} else {
					next = index * 2;
				}
				if (next == k) {
					System.out.println(count[index]);
					return;
				}
				
				if (next>=0&&next<100001&&count[next]==0) {
					que.offer(next);
					count[next] = count[index] + 1;
				}

			}
		}

	}

}

/*
 * BFS는 재귀적 동작 x 어떤 노드를 방문했었는 지의 여부를 검사해야 한다.(무한 루프에 빠질 수 있기 때문) 대기순서에 따라 반복적인
 * 방문을 해야하기 떄문에 queue를 사용
 */
