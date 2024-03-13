import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(br.readLine());
		String binaryString = Integer.toBinaryString(x);
		int answer = 0;
		for(int i=0; i<binaryString.length();i++) {
			if(binaryString.charAt(i)=='1') {
				answer++;
			}
		}
		System.out.println(answer);
	}
}