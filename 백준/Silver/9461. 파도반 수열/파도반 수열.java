import java.util.*;
import java.io.*;

public class Main {
    public static Long[] dp = new Long[101]; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;
        
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            System.out.println(p(n));
        }
    }
    public static Long p(int n){
        if(dp[n]==null){
            dp[n] = p(n-3) + p(n-2);
        }
        return dp[n];
    }
}