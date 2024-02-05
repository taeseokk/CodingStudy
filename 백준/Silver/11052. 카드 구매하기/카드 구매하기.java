import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t+1];
        int[] dp = new int[t+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=t;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=1; i<=t; i++){
            for(int j=1; j<=i; j++){
                dp[i]=Math.max(dp[i],dp[i-j]+arr[j]);
            }
        }
        System.out.println(dp[t]);
        
        
    }
}