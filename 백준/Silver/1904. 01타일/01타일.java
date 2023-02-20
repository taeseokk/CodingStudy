import java.util.*;
import java.io.*;

public class Main {
    public static int[] dp = new int[1000001];    //자연수 n 최대값 만큼 배열 범위 설정
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<dp.length; i++){
            dp[i] = -1;    // -1로 초기화
        }
        System.out.print(tile(n));
    }
    public static int tile(int n){
        if(dp[n]==-1){
            dp[n] = (tile(n-1) + tile(n-2))%15746; 
        }
        return dp[n];
    }
}