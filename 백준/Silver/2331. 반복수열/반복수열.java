import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		ArrayList<Integer> list = new ArrayList<>();
		list.add(a);
		
		while(true) {
			int index = list.get(list.size()-1);
			int result = 0;
			while(index!=0) {
				result += (int)Math.pow(index%10, (double)p);
				index /=10;
			}
			if(list.contains(result)) {
				int answer = list.indexOf(result);
				System.out.println(answer);
				break;
			}
			list.add(result);
		}
		
		
		

		

	}
}

