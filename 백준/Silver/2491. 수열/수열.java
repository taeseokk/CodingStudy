import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		int[][] dp = new int[n][2];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0][0] = 1;
		dp[0][1] = 1;
		
		for(int i=1; i<n; i++) {
			if(arr[i-1]< arr[i]) {
				dp[i][0] = dp[i-1][0] +1;			
				dp[i][1] = 1;
			}

			else if (arr[i - 1] > arr[i]) {
				dp[i][0] = 1;
				dp[i][1] = dp[i - 1][1] + 1;
			}

			else {
				dp[i][0] = dp[i - 1][0] + 1;
				dp[i][1] = dp[i - 1][1] + 1;
			}
		}

		int max = 0;
		for (int i = 0; i < n; i++) {
			max = Math.max(max, Math.max(dp[i][0], dp[i][1]));
		}
        System.out.println(max);
	}
}
