import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int MAX = Integer.MIN_VALUE;	// 최대
	static int MIN = Integer.MAX_VALUE;	// 최소
	static int[] operator = new int[4];	// 연산자
	static int[] number;				// 숫자
	static int n;						// 숫자 개수
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		number = new int[n];
		
		// 숫자
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			number[i] = Integer.parseInt(st.nextToken());
		}

		// 연산자
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(number[0],1);
		
		System.out.println(MAX);
		System.out.println(MIN);
		
	}
	
	static void dfs(int num, int index) {
		if(index == n) {
			MAX = Math.max(num, MAX);
			MIN = Math.min(num, MIN);
			return;		
		}
		
		for(int i=0; i<4; i++) {
			//연산자 개수 확인
			if(operator[i]>0) {
				operator[i]--;
				
				switch(i) {
				case 0:
					dfs(num+number[index],index+1);
					break;
				case 1:
					dfs(num-number[index],index+1);
					break;
				case 2:
					dfs(num*number[index],index+1);
					break;
				case 3:
					dfs(num/number[index],index+1);
					break;
				}
				//재귀함수 종료시 다시 해당 연산자 개수 복구
				operator[i]++;
			}
		}
	}
}