import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        for(int i=0; i<n;i++){
            int time = arr[i][0];
            int money = arr[i][1];
            
            if(i+time <n+1)
                dp[i+time] = Math.max(dp[i]+money, dp[i+time]);
          
                dp[i+1] = Math.max(dp[i+1],dp[i]);

        }
        System.out.print(dp[n]);
    }
}