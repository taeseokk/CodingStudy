import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		String str = br.readLine();
		int answer = 1;
		for(int i=0; i<str.length()/2; i++) {
			char left = str.charAt(i);
			char right = str.charAt(str.length()-1-i);
			
			if(left==right) {
				continue;
			}else {
				answer = 0;
				break;
			}
		}
		System.out.println(answer);

	}
}