import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static boolean[] dp = new boolean[246913];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		solution();

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;

			int count = 0;
			
			
			for(int i=n+1; i<=2*n; i++) {
				if(!dp[i]) count++;
			}
			System.out.println(count);
		}
	}

	public static void solution() {

		dp[0] = dp[1] = true;
		for (int i = 2; i <= Math.sqrt(dp.length); i++) {
			if (dp[i])
				continue;
			for (int j = i * i; j < dp.length; j+=i) {
				dp[j] = true;
			}
		}
	}
}
