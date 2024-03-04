import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken()); // 신청수
			int l = Integer.parseInt(st.nextToken()); // 수강인원
			Integer[] arr = new Integer[p];
			
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<p; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			if(p<l) {
				answer.add(1);
			}else {
				Arrays.sort(arr,Collections.reverseOrder());
				answer.add(arr[l-1]);
			}
		}
		Collections.sort(answer);
		int index = 0;
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += answer.get(i);
			if(sum>m) {
				break;
			}
			index++;
		}

		System.out.println(index);
	}
} 