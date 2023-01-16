import java.util.Scanner;
//DP를 이용한 문제풀기

public class Main {
    static Integer[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new Integer[n+1];
        dp[0] = dp[1] = 0;
        System.out.println(min_count(n));
    }
    static int min_count(int n){ //4가지 경우의수로 나눠 계산
        if (dp[n] == null) {
			// 6으로 나눠지는 경우 
			if (n % 6 == 0) {
				dp[n] = Math.min(min_count(n - 1), Math.min(min_count(n / 3), min_count(n / 2))) + 1;
			}
			// 3으로만 나눠지는 경우 
			else if (n % 3 == 0) {
				dp[n] = Math.min(min_count(n / 3), min_count(n - 1)) + 1;
			}
			// 2로만 나눠지는 경우 
			else if (n % 2 == 0) {
				dp[n] = Math.min(min_count(n / 2), min_count(n - 1)) + 1;
			}
			// 2와 3으로 나누어지지 않는 경우
			else {
				dp[n] = min_count(n - 1) + 1;
			}
		}
		return dp[n];
	}
}