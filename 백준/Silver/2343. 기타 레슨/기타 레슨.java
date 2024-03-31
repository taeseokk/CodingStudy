import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 강의의 수 
		int m = Integer.parseInt(st.nextToken()); // 
		
		int[] blue = new int[n];
		
		int left = 0;
		int right = 0;
				
		st =new StringTokenizer(br.readLine());
		for(int i=0;i<n; i++) { 
			blue[i] = Integer.parseInt(st.nextToken());
			right += blue[i]; // 총합
			left = Math.max(left, blue[i]); // 가장 작은 총합은 가장 큰 수 혼자
		}
		
		
		while(left<=right) {
			int mid = (left+right)/2;
			int answer = countSolution(blue, mid);
			
			if(answer>m) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		System.out.println(left);

	}
	public static int countSolution(int[] blue, int mid) {
		int sum=0;
		int count = 0;
		for(int i=0; i<blue.length; i++) {
			if(sum+blue[i]>mid) {
				sum = 0;
				count++;
			}
			sum+=blue[i];
			
		}
		if(sum !=0)count++;
		return count;
	}
}
