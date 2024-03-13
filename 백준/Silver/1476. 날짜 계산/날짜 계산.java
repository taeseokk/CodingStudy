import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int answer = 0;
		int E = Integer.parseInt(st.nextToken()); // 지구
		int S = Integer.parseInt(st.nextToken()); // 태양
		int M = Integer.parseInt(st.nextToken()); // 달

		int e = 0;
		int s = 0;
		int m = 0;
		// 1년 -> 1 1 1 / 15년 -> 15 15 15 / 16년 -> 1 16 16
		// 17년 2 17 17

		while (E != e || S != s || M != m) {
			
			if ((e++) == 15) {
				e = 1;
			}  if ((s++) == 28) {
				s = 1;
			} if ((m++) == 19) {
				m = 1;
			}
			answer++;
		}
		System.out.println(answer);
	}
}