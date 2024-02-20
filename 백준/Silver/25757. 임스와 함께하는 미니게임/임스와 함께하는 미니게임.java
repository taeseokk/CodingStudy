import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		String game = st.nextToken();
		int check = 0;
		switch (game) {
		case "Y":
			check = 2;
			break;
		case "F":
			check = 3;
			break;
		case "O":
			check = 4;
			break;
		}
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		
		System.out.println(set.size()/(check-1));

	}
}

// y = 2명
// F = 3명
// O = 4명