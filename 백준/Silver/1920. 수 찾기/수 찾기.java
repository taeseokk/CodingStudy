import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arrN = new int[n];
		ArrayList<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arrN);
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i<m; i++) {
			if(Search(Integer.parseInt(st.nextToken()), arrN)>=0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		
	
	}
	public static int Search(int key, int[] arr) {
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(key<arr[mid]) {
				high = mid -1;
			}else if(key>arr[mid]) {
				low = mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}