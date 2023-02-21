import java.util.*;
import java.io.*;

public class Main {
    static Integer dp[];
    static int arr[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new Integer[n+1];
        arr = new int[n+1];
        
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextInt();
        }
        dp[0] = arr[0];    // null로 초기화
        dp[1] = arr[1];
        
        if(n>=2){
            dp[2] = arr[1] + arr[2];    // n이 1일때 예외처리
        }
        System.out.print(find(n));
    }
    static int find(int n){
        if(dp[n]==null){
            dp[n] = Math.max(find(n-2),find(n-3)+arr[n-1]) +arr[n];
        }
        return dp[n];
    }
}