import java.util.*;
import java.io.*;

public class Main{
	static boolean[] visited;
	static int[][] arr;
	static int com,net;
	static int count;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        com = Integer.parseInt(br.readLine());
        net = Integer.parseInt(br.readLine());
        arr = new int[com+1][com+1];
        visited = new boolean[com+1];
        
        for(int i=0;i<net; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	arr[a][b]=arr[b][a]=1;
        }
        dfs(1);
        System.out.println(count-1);
    }
    public static void dfs(int n) {
    	
    	visited[n] = true;
    	count++;
    	for(int i=0; i<=com;i++) {
    		if(arr[n][i]==1&&!visited[i]) {
    			dfs(i);
    		}
    	}
    }
    
}