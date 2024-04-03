import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];

			int count = 0;

			st = new StringTokenizer(br.readLine());

			LinkedList<int[]> que = new LinkedList<>();

			for (int j = 0; j < n; j++) {
				que.offer(new int[] { j, Integer.parseInt(st.nextToken()) });
			}

			while (!que.isEmpty()) {
				int[] front = que.poll();
				boolean check = true;

				for (int k = 0; k < que.size(); k++) {
					if (front[1] < que.get(k)[1]) {
						que.offer(front);

						for (int l = 0; l < k; l++) {
							que.offer(que.poll());
						}

						check = false;
						break;
					}
				}
				if (check == false) {
					continue;
				}
				count++;
				if (front[0] == m) {
					break;
				}
			}

			sb.append(count).append("\n");

		}
		System.out.println(sb);
	}
}
