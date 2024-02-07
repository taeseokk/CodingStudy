import java.util.*;
import java.io.*;

public class Main {
	static int[][] arr;
	static boolean[] check;
	static int n,m;
	static int answer;
	public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1][n+1];
        check = new boolean[n+1];
        
        for(int i=0; i<m;i++) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	arr[a][b]=arr[b][a]=1;
        }
        
        for(int i=1; i<=n;i++) {
        	if(!check[i]) {
        		dfs(i);
        		answer++;
        	}
        }
        System.out.println(answer);
    }
	
	public static void dfs(int k) {
		check[k]=true;
		for(int i=1; i<=n; i++) {
			if(arr[k][i]==1 && !check[i]) {
				dfs(i);
			}
		}
	}
}