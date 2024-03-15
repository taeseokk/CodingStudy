import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[k];
		
		long max = 0; // 랜선 길이의 최대값
		
		for(int i=0; i<k;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max <arr[i]) {
				max = arr[i];
			}
		}
		max++;
		long min = 0; // 최소값
		long mid = 0; // 중간값
		
		while(min<max) {
			mid = (min+max)/2;
			long count = 0;
			
			for(int i=0; i<k; i++) {
				count += (arr[i]/mid);
			}
			if(count<n) {
				max = mid;
			}else {
				min = mid +1;
			}
		}
		System.out.println(min-1);
	}
}
