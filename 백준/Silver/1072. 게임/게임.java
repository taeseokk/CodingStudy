import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		long x = Integer.parseInt(st.nextToken()); // 게임 횟수
		long y = Integer.parseInt(st.nextToken()); // 이긴횟수

		long rate = (y * 100) / x;

		long count = -1;
		long left = 0;
		long right = 1000000000;
		while (left <= right) {
			long mid = (left + right) / 2;

			long nowRate = 100 * (y + mid) / (x + mid);

			if (nowRate > rate) {
				count = mid;
				right = mid - 1;
			} else if (nowRate <= rate) {
				left = mid + 1;
			}
		}
		System.out.println(count);
	}
}
