import java.util.*;
import java.io.*;

public class Main{
    static int[][] dp = new int[31][31];
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n =  Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            System.out.println(solution(m,n));
        }       
    }
    private static int solution(int n, int r){
        if(dp[n][r]>0){
            return dp[n][r];
        }else if(n==r || r==0){
            return dp[n][r]=1;
        }else{
            return dp[n][r] = solution(n-1,r-1)+solution(n-1,r);
        }
    }
}