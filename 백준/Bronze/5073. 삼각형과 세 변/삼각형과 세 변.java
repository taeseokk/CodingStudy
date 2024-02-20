import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while (true) {

			HashSet<Integer> set = new HashSet<>();
			st = new StringTokenizer(br.readLine());

			int a = Integer.parseInt(st.nextToken());
			set.add(a);
			int b = Integer.parseInt(st.nextToken());
			set.add(b);
			int c = Integer.parseInt(st.nextToken());
			set.add(c);
			if (a == 0 && b == 0 && c == 0)
				break;

			if (a + b <= c || b + c <= a || c + a <= b) {
				System.out.println("Invalid");
			} else {

				switch (set.size()) {
				case 1:
					System.out.println("Equilateral");
					break;
				case 2:
					System.out.println("Isosceles ");
					break;
				case 3:
					System.out.println("Scalene");
					break;
				}
			}

		}

	}

}
