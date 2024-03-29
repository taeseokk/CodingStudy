import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int left = 0;
		int right = 0;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			right = Math.max(arr[i], right);
		}
		
		while(left<=right) {
			int mid = (left+right)/2;
			long tree =0;
			
			for(int i=0; i<n; i++) {
				if(arr[i]>mid) {
					tree += arr[i]-mid;
				}
			}
			if(tree>=m) {
				left = mid+1;
			}else if(tree<m) {
				right = mid-1;
			}
		}
		System.out.println(right);
	}
}
