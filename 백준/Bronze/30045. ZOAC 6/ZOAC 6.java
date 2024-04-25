import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			
			for(int j=0; j<str.length()-1; j++) {
				
				String check = str.substring(j,j+2);
				
				if(check.equals("01") || check.equals("OI")) {
					answer++;
					break;
				}
				
			}
		}
		System.out.println(answer);
		
	}
}
