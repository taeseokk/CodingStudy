import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		
		// 성 정보를 배열로 생성
		boolean[][] check = new boolean[n][m];
		String[] arr = new String[m];
		for (int i=0; i<n; i++) {
			arr = br.readLine().split("");
			
			for (int j=0; j<m; j++) {
				if (arr[j].equals("X")) check[i][j] = true;
			}
		}
		
		int notRow = 0; // 가드가 없는 row의 수
		int notColumn = 0; // 가드가 없는 column의 수
		boolean guard;
		// Guard가 없는 Row 체크
		for (int i=0; i< n; i++) {
			guard = false;
			for (int j=0; j<m; j++) {
				if (check[i][j]) { // 가드가 해당 라인에 존재하면 해당 줄은 탐색 종료
					guard = true;
					break;
				}
			}
			if (!guard) notRow++;
		}
		
		// Guard가 없는 Column 체크
		for (int i=0; i< m; i++) {
			guard = false;
			for (int j=0; j<n; j++) {
				if (check[j][i]) { // 가드가 해당 라인에 존재하면 해당 줄은 탐색 종료
					guard = true;
					break;
				}
			}
			if (!guard) notColumn++;
		}
		
		// guard가 없는 line이 더 많은 값 출력
		System.out.println(notRow>notColumn ? notRow:notColumn);
	}
}
