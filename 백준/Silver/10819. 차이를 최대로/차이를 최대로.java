import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] arr;
	static int[] num;
	static boolean[] visited;
	static int n, answer = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());

		arr = new int[n];
		num = new int[n];
		visited = new boolean[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		dfs(0);
		
		System.out.println(answer);

	}

	public static void dfs(int count) {
		if(count==n) {
			int sum = 0;
			for(int i=0; i<n-1; i++) {
				sum += Math.abs(arr[i]-arr[i+1]);
			}
			
			answer = Math.max(answer, sum);
			return;
		}
		for(int i=0; i<n; i++) {
			if(visited[i]) continue;
			
			visited[i] = true;
			arr[count] = num[i];
			dfs(count+1);
			visited[i] = false;
		}
	}
}
