import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> { // 음수 그대로, 양수 교환
			int a1 = Math.abs(o1);
			int a2 = Math.abs(o2);
			if (a1 == a2) {
				return o1 - o2;
			} else {
				return a1 - a2;
			}
		});
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());

			if (num == 0) {
				if (pq.isEmpty()) {
					sb.append("0\n");
				} else {
					sb.append(pq.poll()).append("\n");
				}

			} else {
				pq.add(num);
			}

		}
		System.out.println(sb);
	}
}