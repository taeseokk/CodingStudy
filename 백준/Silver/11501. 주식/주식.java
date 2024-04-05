import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());

		while (t!=0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			long answer = 0;
			int max = arr[n-1];
			
			for(int i=n-2; i>=0; i--) {
				if(arr[i] <=max) {
					answer += max-arr[i];
				}else {
					max = arr[i];
				}
			}
			sb.append(answer).append("\n");
			t--;

		}
		System.out.println(sb);

	}
}
// 1. 주식을 산다.
// 2. 원하는 만큼 판다.
// 3. 아무것도 안한다.