import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		HashMap<String, String> map = new HashMap<>();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());

			String email = st.nextToken();
			String pw = st.nextToken();
			map.put(email,pw);
		}
		
		for(int i=0; i<m;i++) {
			sb.append(map.get(br.readLine())).append("\n"); 
		}
		
		System.out.println(sb);

	}
}