import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int left = 0;
		int right = 0;
		int answer = 0;
		int[] city = new int[n];
		for (int i = 0; i < n; i++) {
			city[i] = Integer.parseInt(st.nextToken());
			right = Math.max(city[i], right);
		}
		
		int m = Integer.parseInt(br.readLine());
		
		while(left<=right) {
			int mid = (left+right);
			int sum = 0;
			for(int i=0; i<n; i++) {
				if(city[i]>mid) {
					sum+=mid;
				}else {
					sum+=city[i];
				}
			}
			if(sum<=m) {
				left=mid+1;
				answer = Math.max(answer, mid);
			}else if(sum>m) {
				right = mid-1;
			}
		}
		System.out.println(answer);
	}
}
