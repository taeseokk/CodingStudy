import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); // 집의 수
		int c = Integer.parseInt(st.nextToken()); // 공유기의 수

		int[] house = new int[n];
		
		for(int i=0; i<n; i++) {
			house[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(house);
		
		int left = 1; // 최소 간격
		int right = house[n-1]; // 최대 간격
		
		while(left<=right) {
			int mid = (left+right)/2;
			
			int location = 0; // 공유기 설치 위치(처음 시작)
			int count = 1;
			for(int i=1; i<n; i++) {
				if(house[i]-house[location]>=mid) {
					location = i;
					count++;
				}
			}
			if(count<c) {
				right = mid-1;
				continue;
			}
				
				left = mid+1;
		}
		System.out.println(left-1);
	}
}
