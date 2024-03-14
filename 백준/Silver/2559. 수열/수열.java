import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		int maxSum = 0;
		int currentSum=0;
		for(int i=0; i<k; i++) {
			currentSum+=arr[i];
		}
		maxSum = currentSum;
		
		for(int i=k; i<arr.length; i++) {
			currentSum = currentSum-arr[i-k] + arr[i];
			maxSum = Math.max(currentSum, maxSum);
		}
		System.out.println(maxSum);
	}
}
