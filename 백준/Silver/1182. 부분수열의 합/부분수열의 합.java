import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[] arr;
	static int n,s;
	static int count =0;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0,0);
		if(s==0) {
			count--;
		}
		
		System.out.println(count);
	}
	
	public static void dfs(int index, int sum) {
		if(index == n) {
			if(sum==s) {
				count++;
			}
			return;
		}
		dfs(index+1,sum+arr[index]);
		dfs(index+1,sum);
		
	}
}