import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int n ,m;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n+1][m+1];
		
		for(int i=0;i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] dp = new int[n+1][m+1];
		dp[0][0] = arr[0][0];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				dp[i][j+1]=Math.max(dp[i][j+1], arr[i][j+1]+dp[i][j]);
				dp[i+1][j]=Math.max(dp[i+1][j], arr[i+1][j]+dp[i][j]);
				dp[i+1][j+1]=Math.max(dp[i+1][j+1], arr[i+1][j+1]+dp[i][j]);
			}
		}
		
		System.out.println(dp[n-1][m-1]);

		
	
	}
	
	
}
