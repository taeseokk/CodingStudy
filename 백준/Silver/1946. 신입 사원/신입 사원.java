import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[n][2];
			for(int j=0; j<n; j++) {
				st = new StringTokenizer(br.readLine());
				arr[j][0] = Integer.parseInt(st.nextToken());
				arr[j][1] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arr,(o1,o2) -> {
				return o1[0]-o2[0];
			});	// 오름차순
			
			int top = arr[0][1];
			int count = 0;
			for(int k=1; k<n; k++) {
				if(top<arr[k][1]) {
					count++;
                    continue;
				}
				top = arr[k][1];
			}
			sb.append(n-count).append("\n");
		}
		System.out.println(sb.toString());

//1 4
//2 5 x
//3 6 x
//4 2
//5 7 x
//6 1
//7 3 x
	}
}


/* 그리디 알고리즘
 * 1. 매 단계마다 최적이라고 생각되는 선택을 하면서 최종적으로 전체적으로 최적의 해답을 찾아내는 것
 * 단계
 * 1) 문제의 최적해 구조를 결정
 * 2) 문제의 구조에 맞게 선택 절차를 정의
 * 3) 선택 절차에 따라 선택을 수행
 * 4) 선택된 해가 문제의 조건을 만족하는지 검사
 * 5) 조건을 만족하지 않으면 해당 해를 제외
 * 6) 모든 선택이 완료되면 해답을 검사
 * 7) 조건을 만족하지 않으면 해답으로 인정되지 않는다.
 * */
