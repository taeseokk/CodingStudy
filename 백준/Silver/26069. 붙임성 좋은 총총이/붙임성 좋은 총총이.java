import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int answer = 0;
		int n = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();
		set.add("ChongChong");
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			
			if(set.contains(s1)||set.contains(s2)) {
				set.add(s1);
				set.add(s2);
			}
			answer = set.size();
		}
        System.out.println(answer);
	}
}
